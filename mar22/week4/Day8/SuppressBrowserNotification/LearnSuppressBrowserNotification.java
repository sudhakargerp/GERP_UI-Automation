package mar22.week4.day8.SuppressBrowserNotification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSuppressBrowserNotification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		//Declare Object for ChromeOptions
		ChromeOptions options = new ChromeOptions();
		
		//suppress the browser notification by argument "--disable-notifications"
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://oldnavy.gap.com/");
		//driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//a[text()='Impact@Snapdeal'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Toddler']")).click();
		System.out.println(driver.getTitle());

	}

}
