package activities;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity8 {
	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
//creating a action object
	Actions builder = new Actions(driver);
		//open the page
		driver.get("https://training-support.net/webelements/mouse-events");
		
		
		//print the element that can be clicked
		System.out.println("Page title: " + driver.getTitle());
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text() = 'Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text() = 'Cargo.toml']"));
		WebElement srcButton = driver.findElement(By.xpath("//h1[text() = 'src']"));
		WebElement targetButton = driver.findElement(By.xpath("//h1[text() = 'target']"));
		
		//perform left click on Cargo.lock and then click on Cargo.tom1
		builder.click(cargoLock).pause(2000).click(cargoToml).pause(2000).build().perform();
		
		
		//print  the front side text
		String actionMessage = driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		
		//perform double click on src then right click on target
		builder.doubleClick(srcButton).pause(2000).contextClick(targetButton).pause(2000).perform();
		//and the open it
		builder.click(driver.findElement(By.xpath("//span[text( = 'open']"))).build().perform();
		
		//Print the front side text
		actionMessage = driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		
		}
}