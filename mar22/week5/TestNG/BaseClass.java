package mar22.week5.day9.TestNG;

import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	
			public ChromeDriver driver;
			
  @BeforeMethod
  public void beforeMethod() {
	 
	WebDriverManager.chromedriver().setup();  
	  driver = new ChromeDriver();
	   
		  driver.get("https://demo.guru99.com/test/login.html");
		  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
