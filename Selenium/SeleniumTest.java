package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) 
	{
	    WebDriver driver = new FirefoxDriver();	
	    driver.get("https://training-support.net");
        driver.quit();
	}

}
