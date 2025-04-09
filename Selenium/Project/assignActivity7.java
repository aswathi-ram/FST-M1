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

public class assignActivity7
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
	    List<WebElement> list = driver.findElements(By.xpath("//h3[contains(@class,'entry-title')]"));

	    // Get the number of courses and print it
	    int size = list.size();
	    System.out.println("total number of courses: " + size);

	    System.out.println("number of courses on the page:");
	    // Iterate through the list and print each course title
	    for (WebElement ele : list) {
	        System.out.println(ele.getText());
	    }
	}
	
		
	 @AfterClass
	 public void tearDown()
	{
		driver.quit();
	}
}

