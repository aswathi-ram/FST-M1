package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity6 {
	 WebDriver driver;
	    
	    @BeforeClass
	    public void setUp() {
	        // Set the path for ChromeDriver
	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	    }
	    
	    @Test
	    public void testLogin() {
	        // a. Open the browser and navigate to the website
	        driver.get("https://alchemy.hguy.co/lms");
	        
	        // b. Find and click the "My Account" menu item
	        WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
	        myAccountMenu.click();
	        
	        // c. Verify the page title
	        String expectedTitle = "My Account – Alchemy LMS";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
	        
	        // d. Click the "Login" button
	        WebElement loginButton = driver.findElement(By.linkText("Login"));
	        loginButton.click();
	        
	        // e. Enter username and password
	        WebElement usernameField = driver.findElement(By.id("user_login"));
	        WebElement passwordField = driver.findElement(By.id("user_pass"));
	        usernameField.sendKeys("your-username");
	        passwordField.sendKeys("your-password");
	        
	        // f. Click the login button
	        WebElement submitButton = driver.findElement(By.id("wp-submit"));
	        submitButton.click();
	        
	        // g. Verify login success
	        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
	        Assert.assertTrue(logoutLink.isDisplayed(), "Login was not successful");
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

