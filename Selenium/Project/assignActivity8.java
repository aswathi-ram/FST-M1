package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignActivity8
{

WebDriver driver;  //declare class objects
	
	@BeforeMethod
	public void setup()  //setup function - driver initialization
	{
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test(priority = 1)
	public void navigateToContact() throws InterruptedException
	{
		
		WebElement contactLink  = driver.findElement(By.linkText("Contact"));
		
		contactLink.click();
		
		String contactPageTitle = driver.getTitle();
		
		System.out.println("My Account Page title display as: "+ contactPageTitle);
		
		//assertEquals(myAccountPageTitle, "My Account – Alchemy LMS");
		
	}
	
	@Test(priority = 2)
	public void contacFormFields() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("//a[@href = '#login']")));
				
	 Thread.sleep(5000);
        WebElement fullNameField = driver.findElement(By.name("wpforms[fields][0]"));
        fullNameField.sendKeys("Bhaskar A");
        
        
        // Use JavascriptExecutor to scroll the Full Name field into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700);");
        
        js.executeScript("arguments[0].scrollIntoView(true);", fullNameField);
        
        WebElement emailField = driver.findElement(By.name("wpforms[fields][1]"));
        emailField.sendKeys("test@gmail.com");
        
        WebElement messageField = driver.findElement(By.name("wpforms[fields][2]"));
        messageField.sendKeys("");
        		
		//System.out.println("My Account Page title display as: "+ myAccountPageTitle);
		
		//assertEquals(myAccountPageTitle, "My Account – Alchemy LMS");
		
	}
	
	@Test(priority = 3)
	public void clickSendBtn()
	{
		WebElement btn = driver.findElement(By.xpath("//button[@name = 'wpforms[submit]']"));
		btn.click();
		
	}
		
	
	 //@AfterClass  
	public void tearDown()
	{
		driver.quit();
	}
}

