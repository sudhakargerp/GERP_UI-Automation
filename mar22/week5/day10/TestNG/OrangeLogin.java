package mar22.week5.day10.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin extends OrangeBaseClass{
	
	@Test (priority =1)
	public void Admin()
	{
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
	}
	
	@Test (priority = 2, dependsOnMethods ="Admin")
	public void Leave()
	{
		driver.findElement(By.xpath("//b[text()='Leave']")).click();	
	}
	
}
