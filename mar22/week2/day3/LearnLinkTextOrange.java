package mar22.week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLinkTextOrange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sudhakarshankar-trials7401.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("a@nORjM04K");
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Partial Text xpath: tagName[contains(text(),'partial Text Value')]
		//driver.findElement(By.xpath("//span[contains(text(),'My In')]")).click();
		
		//Partial Attribute xpath: tagName[contains(@attribute,'partial Text Attribute Value')]
		
	driver.findElement(By.xpath("//i[text()='help']")).click();
		
		
	}

}
