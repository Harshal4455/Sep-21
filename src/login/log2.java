package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log2
{
	@FindBy(xpath = "//div[contains(@class,'form-')]")private WebElement userID;
	
	
	public log2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUserID()
	{
		String actualresult = userID.getText();
		return actualresult;
	}

}
