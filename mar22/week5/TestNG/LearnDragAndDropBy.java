package mar22.week5.day9.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDropBy {

	@Test
	public void learnDragAndDropBy() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(sourceElement, 60, 60).perform();
		driver.close();
	}

}
