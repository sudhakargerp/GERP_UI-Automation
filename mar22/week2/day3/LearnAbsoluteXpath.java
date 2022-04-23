package mar22.week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAbsoluteXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sudhakarshankar-trials7401.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Admin");
		
		

	}

}
