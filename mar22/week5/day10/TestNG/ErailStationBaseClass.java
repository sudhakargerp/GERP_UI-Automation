package mar22.week5.day10.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailStationBaseClass {

	public ChromeDriver driver;
	@BeforeMethod()
	public void Erail()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/ksr-bengaluru-SBC/bhopaljn-BPL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.close();
	}
}
