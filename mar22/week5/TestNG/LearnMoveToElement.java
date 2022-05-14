package mar22.week5.day9.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElement {

	@Test
	public void learnMoveToElement() {
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
		
		driver.close();

	}

}
