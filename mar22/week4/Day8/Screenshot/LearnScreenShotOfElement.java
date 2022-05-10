package mar22.week4.day8.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShotOfElement {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WebElement flight = driver.findElement(By.xpath("(//img[@alt='IRCTC Logo'])[1]"));
		
		Date date= new Date();		
		System.out.println(date);
		String dateFormat = date.toString().replaceAll("[:, ]", "");
		
		//Step 1: Get the source screen shot as output file
		File sourceScreenshot = flight.getScreenshotAs(OutputType.FILE);
		
		//Step2: Create a Target File
		File targetScreenSHot = new File("./snaps/screenshot_"+dateFormat+".jpeg");
		
		//Step3: Copy the Source to the Target
		FileUtils.copyFile(sourceScreenshot, targetScreenSHot);
		

	}

}
