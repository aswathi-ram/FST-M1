package assignmentPackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity9
{

WebDriver driver;  //declare class objects
//WebDriverWait wait;	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
	}
	
	@Test(priority = 0)
	public void navigateToAllCourseLink() throws InterruptedException {
	    // Find and click the "All Courses" link
	    WebElement allCourseLink = driver.findElement(By.linkText("All Courses"));
	    allCourseLink.click();

	    // Wait for the courses to be displayed (Optional but useful if page takes time to load)
	    
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(@class,'entry-title')]")));

	    // Find all course titles using the XPath for <h3> elements with class 'entry-title'
	    WebElement courseLink = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/' and @class='btn btn-primary']"));
	    courseLink.click();

	    System.out.println(driver.getTitle());
	
	 	}
	
		
	 //@AfterClass
	 public void tearDown()
	{
		driver.quit();
	}
}

