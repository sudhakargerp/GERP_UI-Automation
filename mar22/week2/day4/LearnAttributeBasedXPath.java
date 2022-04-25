package mar22.week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAttributeBasedXPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//partial attribute 
		//driver.findElement(By.xpath("//input[contains(@name,'btn')][1]")).click();
		
		//partial text -//tagName[contains(text(),'value')]
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Gtpl')]")).getText();
		System.out.println(text);
		
		String text2 = driver.findElement(By.xpath("//label[starts-with(@id,'message')][1]")).getText();
		System.out.println(text2);
		

		
	}

}
