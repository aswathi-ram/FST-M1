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

public class assignActivity4
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test(priority = 0)
	public void verifyPopularCourseSecondTitle()
	{
		WebElement PopularCourseTitle  = driver.findElement(By.xpath("//*[@id=\"post-71\"]/div[2]/h3"));
		
		String PopularCourseTitleTxt =  PopularCourseTitle.getText();
		
		System.out.println("Most popular course of second title text: "+ PopularCourseTitleTxt);
		
		assertEquals(PopularCourseTitleTxt, "Email Marketing Strategies");
		
	}
	
	 @AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

