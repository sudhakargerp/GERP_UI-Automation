package mar22.week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLinkText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/link.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demo.guru99.com (unsafe)")).click();
		
		
		//xpath: //tagName[@attribue='attributeValue']
		//xpath: //tagName[@attribue='attributeValue'][index]
		//xpath: //tagName[text()='textValue']
		
		driver.findElement(By.xpath("//a[text()='click here'][2]")).click();		

	}

}
