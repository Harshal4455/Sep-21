package sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan\\Desktop\\Velocity\\selenium JAR\\chromeexe\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mi");
	
	}
	
}
