package mar22.week4.day8.AdvancedActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);		
		//WebElement doubleClick = driver.findElement(By.xpath("//aside/p[text()='Double click to resize this object.']"));
		//WebElement doubleClick = driver.findElement(By.xpath("//aside/h3[text()='My Card']"));
		WebElement doubleClickAction = driver.findElement(By.xpath("//main[@id='content']"));
		action.doubleClick(doubleClickAction).perform();
		driver.close();
		

		
	}

}
