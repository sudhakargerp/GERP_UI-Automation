package mar22.week4.day7.WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//NoSuchElementException
		driver.findElement(By.xpath("//h3[text()='JavaScript Alert']")).getText();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		String result = driver.findElement(By.id("result")).getText();
		
		if(result.contains("You clicked: Ok"))
		{
			System.out.println("The result of OK is as expected - Passed");
		}
			
		else
		{
			System.out.println("The result is not as expected - Failed");
		}			

		//Trying to interact with the alert that is not currently active - No Alert Present Exception
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		
		
		//ElementNotInteractableException when the element is not found
		//driver.switchTo().alert().sendKeys("Hi");
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		
		
		String cancelResult = driver.findElement(By.id("result")).getText();
		
		if (cancelResult.contains("You clicked: Cancel"))
		{
			System.out.println("The result of Cancel is as expected - Passed");
		}
		
		else
		{
			System.out.println("The result of cancel is not as expected - Failed");
		}
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
