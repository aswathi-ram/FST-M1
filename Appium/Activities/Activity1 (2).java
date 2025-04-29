package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Activity1 {
	AppiumDriver driver;
	
	//setup appium setup
	@BeforeClass
	public void androidSetUp() throws MalformedURLException, URISyntaxException
	{
		UiAutomator2Options options = new UiAutomator2Options().
		setPlatformName("android").
		setAutomationName("UiAutomator2").
		//setApp("path/to/file.apk").
		setAppPackage("com.google.android.calculator").
		setAppActivity("com.android.calculator2.Calculator").
		noReset();
		
		URL serverURL = new URI("http://127.0.0.1:4723").toURL();
				
		driver = new AndroidDriver(serverURL , options);
		
	}
	
	@Test
	public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_6")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("digit_7")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
 
        // Find the result
        String result = driver.findElement(AppiumBy.id("result")).getText();
 
        // Assertion
        Assert.assertEquals(result, "42");
    }
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	/*@BeforeClass
	public void IOSSetUp()
	{
		XCUITestOptions options = new XCUITestOptions().
		setPlatformName("ios").
		setAutomationName("XCUITest").
		setApp("path/to/file.ipa").
		noReset();
	}*/
	
	
	//Set Appium server URL
	
}
