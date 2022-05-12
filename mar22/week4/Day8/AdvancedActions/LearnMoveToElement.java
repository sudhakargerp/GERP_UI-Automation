package mar22.week4.day8.AdvancedActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		//moveToElement will move the cursor to the center of the argument reference that you passes
		//methods of Action class always need to end with perform()
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[text()='Shorts'])[1]")).click();
		
		

	}

}
