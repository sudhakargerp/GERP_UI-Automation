package mar22.week4.day7.WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNonModalAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.royalalacati.com/sweetalert/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[text()='Try me!'][1]")).click();
		String text = driver.findElement(By.xpath("//h2[contains(text(), 'a message')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
	}

}
