package mar22.week4.day8.AdvancedActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRightClick {
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Actions action = new Actions(driver);
	WebElement righClick = driver.findElement(By.xpath("//span[text()='Element: dblclick event']"));
	action.contextClick(righClick).perform();
	
	
	//span[text()='Element: dblclick event']
	}
}
