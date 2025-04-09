package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity1 extends BaseClass {

	@Given("user is on home page")
	public void openPage() {
		driver.get("https://training-support.net/");
		
		//Assertion
		assertEquals("Training Support",driver.getTitle());
	}
	
	@When("user clicks on about us")
	public void clickLink() {
		driver.findElement(By.linkText("About Us")).click();
	}
	
	@Then("page is redirected")
	public void redirectTo() {
		assertEquals("About Training Support",driver.getTitle());
	}
	
	
}
