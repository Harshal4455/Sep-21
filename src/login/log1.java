package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log1 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement logbtn;
	
	public log1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUN(String username)
	{
		UN.sendKeys(username);
	}
	public void inpPWD(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickonLogbtn()
	{
		logbtn.click();
	}

}
