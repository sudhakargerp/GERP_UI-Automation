package StepDefntn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainMenuLinks extends BaseClass {	
	
	
	@When("Click the menu_admin_viewAdminModule button")
	public void clickLink() {
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	}
	
	@Then("Username field should be displayed")
	public void usernameField() {
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		
		if (text.equals("Username"))
		{
			System.out.println("Admin page is displayed");
		}
		
		else if(text.equals("Id"))
		{
			System.out.println("PIM page is displayed");
		}
		else
			System.out.println("Invalid Page");
	}

}
