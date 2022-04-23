package mar22.week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelniumLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demo.guru99.com (unsafe)")).click();
		
		/*
		 * driver.findElement(By.id("email")).sendKeys("sudhakarkshankar@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("test");
		 * driver.findElement(By.id("SubmitLogin")).click();
		 */
		
		driver.findElement(By.className("is_required validate account_input form-control")).sendKeys("sudhakarkshankar@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("test");
		driver.findElement(By.name("SubmitLogin")).click();
	}

}
