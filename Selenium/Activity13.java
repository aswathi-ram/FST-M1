package activities;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Activity13 {
	
	public static void main(String[] args) {
		
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        // Create the Actions object
        
     // Open the page
        driver.get("https://training-support.net/webelements/tables");
        
        //print the title of the page
        
        System.out.println("Page title: " + driver.getTitle());
        
        //print the number of columns
        
        List<WebElement> cols = driver.findElements(By.xpath("//table/thread/tr/th"));
        System.out.println("Number Of Columns: "+ cols.size());
        
        //PrinList<A>e number of rows
        
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        
        //Print the cells values of the third row
        
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for(WebElement cell :thirdRow) {
        	System.out.println(cell.getText());
        	
        	
        	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
        }
        
        
        // Close the browser
        driver.quit();

}
}

