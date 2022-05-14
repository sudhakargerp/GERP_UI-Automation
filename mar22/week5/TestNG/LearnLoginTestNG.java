package mar22.week5.day9.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LearnLoginTestNG extends BaseClass {
	
			@Test
			public void login() {
			  driver.findElement(By.id("email")).sendKeys("sudhakar.karuppa@gmail.com");
			  driver.findElement(By.id("passwd")).sendKeys("test");
			  driver.findElement(By.id("SubmitLogin")).click();
			
		}

}
