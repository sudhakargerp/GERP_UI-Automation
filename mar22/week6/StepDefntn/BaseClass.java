package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {

	public static ChromeDriver driver;
	
	
	  @BeforeMethod
	  public void preCondition() 
	  { 
		  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	  }
	  
	  @AfterMethod 
	  public void postCondition() 
	  { 
		  driver.close(); 
	  }
}
