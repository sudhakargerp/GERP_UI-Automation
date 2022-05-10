package mar22.week4.day8.windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowHandle = new ArrayList<String>(windowHandles);
		String firstWindow = windowHandle.get(0);
		String secondWindow = windowHandle.get(1);
		
		System.out.println(windowHandles);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("emailid")).sendKeys("sudhakar.karuppa@gmail.com");
		driver.switchTo().window(firstWindow);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	}

}
