package mar22.week6.day10.ConstructorAndStatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	String ExpectedResult = "Welcome Page";
	
	@Test
	public void learnAssert()
	{
		String ActualResult = "Welcome";
		//Assert.assertEquals(ActualResult, expectedResult); - HardAssert
		
		SoftAssert softassert = new SoftAssert(); // SoftAssert
		softassert.assertEquals(ActualResult, ExpectedResult);
		System.out.println("End of the Prigram");
		
			
		  WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		  ChromeDriver(); driver.get("https://www.google.ca/"); boolean google =
		  driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		  //Assert.assertFalse(google); System.out.println("End of the Program");
		
		  softassert.assertAll();
	}

}
