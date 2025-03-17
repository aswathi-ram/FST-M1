package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
       
    }

    @Test
    public void verifyInfoBoxTitle() {
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/lms");

        // Locate the first info box title
        WebElement firstInfoBox = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));
        String actualTitle = firstInfoBox.getText();

        // Expected title
        String expectedTitle = "Actionable Training";

        // Verify if the title matches
        Assert.assertEquals(actualTitle, expectedTitle, "Info box title does not match!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}


