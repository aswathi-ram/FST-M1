package assignmentPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity1 
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		
	}
	
	@Test(priority = 0)
	public void pageTitleTest()
	{
		assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
		
	}
	
	 @AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

