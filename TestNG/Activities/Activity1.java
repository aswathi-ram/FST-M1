package Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
//import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    WebDriverWait wait;
    
    //String url = "https://alchemy.hguy.co/lms";
    //String expectedTitle = "Alchemy LMS – An LMS Application";

    @BeforeClass
    public void setup() {
        // Set up ChromeDriver (Ensure chromedriver is in system PATH or specify its location)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	driver = new FirefoxDriver();
    }

    @Test
    public void testTitle() {
        // Navigate to the URL
        driver.get("https://alchemy.hguy.co/lms");
        
        // Get the title of the page
        String title = driver.getTitle();
        
        // Assert that the title matches expected
        assertEquals(title, "Alchemy LMS – An LMS Application", "Title does not match!");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        //driver.quit();
    }
}


