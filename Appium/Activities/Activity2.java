package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Activity2 {
	AppiumDriver driver;
	
	//setup appium setup
	@BeforeClass
	public void androidSetUp() throws MalformedURLException, URISyntaxException
	{
		UiAutomator2Options options = new UiAutomator2Options().
		setPlatformName("android").
		setAutomationName("UiAutomator2").
		//setApp("path/to/file.apk").
		setAppPackage("com.android.chrome").
		setAppActivity("com.google.android.apps.chrome.Main").
		noReset();
		
		URL serverURL = new URI("http://127.0.0.1:4723").toURL();
				
		driver = new AndroidDriver(serverURL , options);
		driver.get("https://training-support.net");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
    public void chromeTest() {
        // Find heading on the page
        String pageHeading = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='Training Support']"
        )).getText();
 
        // Print to console
        System.out.println("Heading: " + pageHeading);
        
        
 
        // Find and click the About Us link
        driver.findElement(AppiumBy.accessibilityId("About Us")).click();
 
        // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='About Us']"
        )).getText();
        System.out.println(aboutPageHeading);
    }
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
