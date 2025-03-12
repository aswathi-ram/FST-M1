package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input [@placeholder='Username']")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input [@placeholder='Password']")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//Button[text()='Submit]")).click();

        // Print the confirmation message
        String message = driver.findElement(By.xpath("")).getText();
        System.out.println("Login message :" +message);

        // Close the browser
        driver.quit();
    }
}

public class Activity3 {

}
