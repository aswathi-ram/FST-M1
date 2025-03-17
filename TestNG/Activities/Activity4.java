package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

public class Activity4 {

    WebDriver driver;
    WebDriverWait wait; // Declare wait at class level

    @BeforeClass
    public void setup() {
        //WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize wait AFTER initializing the driver
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void verifySecondMostPopularCourse() {
        driver.get("https://alchemy.hguy.co/lms");

        // Wait for the courses section to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ld_course_list-items")));

        // Locate the 'Most Popular Courses' section
        List<WebElement> popularCourses = driver.findElements(By.cssSelector(".ld_course_list-items .entry-title"));

        // Debugging: Print the size of the list
        System.out.println("Number of courses found: " + popularCourses.size());

        // Ensure there are at least two courses in the list
        Assert.assertTrue(popularCourses.size() >= 2, "Less than two courses found in the most popular section.");

        // Get the title of the second most popular course
        String secondCourseTitle = popularCourses.get(1).getText().trim();
        System.out.println("Second course title: " + secondCourseTitle);

        // Verify the title matches 'Email Marketing Strategies'
        Assert.assertEquals(secondCourseTitle, "Email Marketing Strategies",
            "Expected: 'Email Marketing Strategies' but found: '" + secondCourseTitle + "'");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}