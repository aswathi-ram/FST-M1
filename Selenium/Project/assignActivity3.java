package assignmentPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity3
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test(priority = 0)
	public void verifyFirstInfoBox()
	{
		WebElement firstInfoBoxTitle  = driver.findElement(By.xpath("//h3[normalize-space()='Actionable Training']"));
		
		String firstInfoBoxTitleTxt =  firstInfoBoxTitle.getText();
		
		System.out.println("title text of the first info box: "+ firstInfoBoxTitleTxt);
		
		assertEquals(firstInfoBoxTitleTxt, "Actionable Training");
		
	}
	
	 @AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

