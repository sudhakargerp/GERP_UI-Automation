package mar22.week2.day4;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRelativeXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[text()='Software Testing']")).getText();
	//	System.out.println(driver.findElement(By.xpath("(//a[@target='_top'])[32]")).getText());
		//System.out.println(driver.findElement(By.xpath("(//a[contains(@class,'dropdown')])[1]")).getText());\
		
		//System.out.println(driver.findElement(By.xpath("b[text()='SAP']/ancestor::div[@class='featured-box']")).getText());
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
				
		driver.findElement(By.cssSelector("input#email"));
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		//driver.findElement(By.xpath("//a[text()='Software Testing']"));
		
		
		//using Child Item Index
		//li[@style='width:100%;']/a[text()='Cucumber Testing']
		
		//USING AND Condition
		//h1[@class='thick-heading' and @style='margin-top:0px;']
		
		//Axes Based Xpath (or) Relation Based xpath
		
		
		

	}

}
