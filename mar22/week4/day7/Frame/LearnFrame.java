package mar22.week4.day7.WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame("frame1");
		String text2 = driver.findElement(By.id("topic")).getText();
		System.out.println(text2);
		
		//driver.findElement(By.tagName("input")).sendKeys("Hi, this is Sudhakar here");
		driver.findElement(By.xpath("(//b[@id='topic'])/following::input")).sendKeys("Hi, this is Sudhakar here");

		//System.out.println(text);
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		//switch to the parent frame - .parentframe()
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//b[@id='topic'])/following::input")).clear();
		
				
		//switch to the home window (html DOM page)
		driver.switchTo().defaultContent();
		String text3 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text3);
		
		driver.switchTo().frame("frame2");
		
		WebElement dropdown = driver.findElement(By.id("animals"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		
		
		

	}

}
