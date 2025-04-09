package assignmentPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity5
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test(priority = 0)
	public void navigateToMyAccount()
	{
		WebElement myAccountLink  = driver.findElement(By.xpath("//a[contains(@href,'my-account')]"));
		
		myAccountLink.click();
		
		String myAccountPageTitle = driver.getTitle();
		
		System.out.println("My Account Page title display as: "+ myAccountPageTitle);
		
		assertEquals(myAccountPageTitle, "My Account – Alchemy LMS");
		
	}
	
	 @AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

