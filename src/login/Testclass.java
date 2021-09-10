package login;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testclass extends baseclass
{
	log1 logs1;
	log2 logs2;
	WebDriver driver;
	
	@BeforeClass
	public void initialization()
	{Reporter.log("open browser",true);
		openbrowser();
		logs1=new log1(driver);
		logs2=new log2(driver);
	}
	
	@BeforeMethod
	public void logins() throws EncryptedDocumentException, IOException
	{
		
		logs1.inpUN(UtilityClass.gettestdata(0, 0));
		logs1.inpPWD(UtilityClass.gettestdata(0, 1));
		logs1.clickonLogbtn();
		
	}
	
	@Test
	public void verifyUN() throws EncryptedDocumentException, IOException
	{
		String actual= logs2.verifyUserID();
		String expected = UtilityClass.gettestdata(0,4);
		assertEquals(actual, expected, "both values are different");
		
	}

}
