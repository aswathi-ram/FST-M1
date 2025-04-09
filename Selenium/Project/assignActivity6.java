package assignmentPackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assignActivity6
{

WebDriver driver;  //declare class objects
	
	@BeforeClass
	public void setup()  //setup function - driver initialization
	{
		driver = new ChromeDriver();
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
	
	@Test(priority = 1)
	public void myAccountLoginBtn() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("//a[@href = '#login']")));
				
		WebElement loginBtn  = driver.findElement(By.xpath("//a[@href = '#login']"));
		
		loginBtn.click();
		
		 // 4. Wait for the login popup to be visible
        driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		
		
		//System.out.println("My Account Page title display as: "+ myAccountPageTitle);
		
		//assertEquals(myAccountPageTitle, "My Account – Alchemy LMS");
		
	}
		
	
	 //@AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

