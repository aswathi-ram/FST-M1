package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
	public static void main(String[] args) {
		//intilize the firfox driver
				WebDriver driver = new FirefoxDriver();
		;
				//Open the page
				driver.get("https://training-support.net/webelements/dynamic-attributes");
				
				//print the title of the page
				System.out.println("Page title: "+ driver.getTitle());
				
				//find the input field
				WebElement nameField = driver.findElement(By.xpath("//input[contains(@id, 'full-name-')]"));
				WebElement emailField = driver.findElement(By.xpath("//input[contains(@id, '-email')]"));
				WebElement dataField = driver.findElement(By.xpath("//label[contains(text(),'event?')]/following-sibling::input[@type='date']"));
				
				WebElement detailsField = driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]"));
				
				//type input values
				nameField.sendKeys("Saahil");
				emailField.sendKeys("saahil@gmil.com");
				dataField.sendKeys("2025-03-10");
				detailsField.sendKeys("End of course party");
				
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				
				//print the success message
				String message = driver.findElement(By.id("action-confimation")).getText();
				System.out.println("Success message: " + message);
				
				
	}
}