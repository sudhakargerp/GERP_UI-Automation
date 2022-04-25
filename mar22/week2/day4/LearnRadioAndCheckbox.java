package mar22.week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnRadioAndCheckbox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("vfb-7-3")).click();
		
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
			for (int i=0; i<2; i++)
			{
				
				
				checkbox2.click();
				System.out.println(checkbox2.isSelected());
				
				
				System.out.println(checkbox3.isSelected());
				
				
				System.out.println(checkbox1.isSelected());
			}
	}

}
