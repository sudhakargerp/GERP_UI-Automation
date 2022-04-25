package mar22.week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCloseAndQuit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
		//driver.close(); - close() closes only the current window on which Selenium is running automated tests. The WebDriver session, however, remains active.
		driver.quit(); //driver.quit() On the other hand, the driver. quit() method closes all browser windows and ends the WebDriver session.
	}

}
