package login;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan\\Desktop\\Velocity\\selenium JAR\\chromeexe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

}
