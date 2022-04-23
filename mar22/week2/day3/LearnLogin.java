package mar22.week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLogin {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://demo.guru99.com/test/login.html");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("email")).sendKeys("sudhakar.karuppa@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("test");
		 * driver.findElement(By.id("SubmitLogin")).click();
		 */
		
		driver.get("https://demo.guru99.com/test/link.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("//a[text()='click here'][1]")).click();
		
		
	}

}
