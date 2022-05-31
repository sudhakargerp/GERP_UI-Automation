package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseClass {
	
	/*
	 * @Given("User opens the Browser") public void openBrowser() {
	 * 
	 * }
	 * 
	 * @Given("Load the application URL") public void loadURL() {
	 * 
	 * 
	 * }
	 */
	
	@Given("Enter the username as {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pword) {
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
	}
	
	//Duplicate steps are not allowed in the Implementation Class / Methods
	/*
	 * @Given("Enter the password as \"admin12\"") public void invalidPassword() {
	 * 
	 * driver.findElement(By.id("txtPassword")).sendKeys("admin12"); }
	 */
	 
	
	@When("Click the Login button")
	public void clickLogin() 
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("OrangeHRM Homepage should be displayed")
	public void displayHomePage() 
	{
		boolean displayed = driver.findElement(By.id("MP_link")).isDisplayed();
		
		if (displayed)
		{
			System.out.println("Logged in successfully");
		}
		else
		System.out.println("Not Logged in successfully due to invalid login credential");
	}
	
	@But("Error message should be displayed")
	public void errorMessage() {
		String error = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		if (error.equalsIgnoreCase("Invalid credentials"))
		{
			System.out.println("Invalid Credential Message displayed successfully");
		}
		
		else
			System.out.println("Not the correct message when entering invalid credentails");
	}
}
