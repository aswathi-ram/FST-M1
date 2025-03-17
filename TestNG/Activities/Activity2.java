package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity2 {
	
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up ChromeDriver (Make sure to set the correct path if necessary)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new FirefoxDriver();

        //driver.manage().window().maximize();
    }

    @Test
    public void verifyHeading() {
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/lms");

        // Get the heading text
        WebElement headingElement = driver.findElement(By.tagName("h1"));
        String actualHeading = headingElement.getText();

        // Verify the heading text
        String expectedHeading = "Learn from Industry Experts";
        Assert.assertEquals(actualHeading, expectedHeading, "Heading does not match!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}