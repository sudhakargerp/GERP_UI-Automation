package mar22.week5.day10.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeBaseClass {
	
	public ChromeDriver driver;
	
	@Parameters({"url","password","username"})
	@BeforeMethod()
	
	public void Login(String url, String pword, String unmae)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys(unmae);
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	

}
