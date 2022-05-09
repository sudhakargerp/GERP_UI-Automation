package mar22.week4.day7.WebTables;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnInformationAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		driver.switchTo().alert().accept();
		
		String result = driver.findElement(By.id("result")).getText();
		
		if(result.contains("You successfully clicked an alert"))
		{
			System.out.println("Result is as expected - Step Passed");
		}
		
		else
		{
			System.out.println("Result is not as expected - Step Failed");
		}
		
		
		
	}

}
