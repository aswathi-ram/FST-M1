package assignmentPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity2
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test(priority = 0)
	public void verifHeading()
	{
		String heading  = driver.findElement(By.tagName("h1")).getText();
		
		System.out.println("Page Heading display as: "+ heading);
		
		assertEquals(heading, "Learn from Industry Experts");
		
	}
	
	 @AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

