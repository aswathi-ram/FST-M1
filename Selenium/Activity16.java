package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity16 {
	
	public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

       //Find the drop down
        
        WebElement selectElement = driver.findElement(By.cssSelector("select.h-10"));
        
        //pass the WebElement to the Select object
        
        Select dropdown = new Select(selectElement);
        
        //Select the second option using visible text
        
        dropdown.selectByVisibleText("One");
        
        //Print the selected option
        
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //Select the third option using index
        
        dropdown.selectByIndex(2);
        
        //Print the selected option
        
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //Select the fourth option using value
       
        dropdown.selectByValue("three");
        
        //Print the selected option
        
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //Print all the  options
        
        System.out.println("Options in select are:");
        for(WebElement option : dropdown.getOptions()) {
        	System.out.println(option.getText());	
        	
        
         // Close the browser
        driver.quit();
    }
}

}
