package mar22.week5.day10.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeAdminAfterLogin extends OrangeBaseClass{
	
	@Test (priority = 3, dependsOnMethods = {"mar22.week5.day10.TestNG.OrangeLogin.Leave", "mar22.week5.day10.TestNG.OrangeLogin.Admin"})
	public void Time()
	{
		driver.findElement(By.xpath("//b[text()='Time']")).click();	
	}

}
