package mar22.week5.day9.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGuru99LoginTestNG {

	@Test
	public void GuruLogin()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("sudhakar.karuppa@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("test");
		  driver.findElement(By.id("SubmitLogin")).click();
		  driver.close();
		

	}

}
