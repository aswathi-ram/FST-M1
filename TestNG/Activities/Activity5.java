package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;
    private String baseUrl = "https://alchemy.hguy.co/lms";

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/FirefoxDriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void navigateToMyAccount() {
        // a. Open the browser and navigate to the site
        driver.get(baseUrl);

        // b. Find the navigation bar and locate the "My Account" menu item
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        
        // c. Click the "My Account" menu item
        myAccountLink.click();
        
        // d. Verify the page title
        String expectedTitle = "My Account – Alchemy LMS";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @AfterClass
    public void tearDown() {
        // e. Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
