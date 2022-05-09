package mar22.week4.day7.WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPromptAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		
		//Alert is still alive. But I try to access the main webpage window
		//driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		String input ="Hi, Welcome to Prompt Alert";
		alert.sendKeys(input);
		alert.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		if (result.contains("You entered: "+input))
		{
			System.out.println("Result of Ok is as expected - Passed");
		}
		
		else
		{
			System.out.println("Result of Ok is not as expected - Failed");
		}
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		alert.sendKeys(input);
		alert.dismiss();
		String result1 = driver.findElement(By.id("result")).getText();
		
		if (result1.contains("You entered: null"))
		{
			System.out.println("Result of Cancel is as expected - Passed");
		}
		
		else
		{
			System.out.println("Result of Cancel is not as expected - Failed");
		}
		
				

	}

}
