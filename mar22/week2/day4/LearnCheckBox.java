package mar22.week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
		
		for (int i=0; i<2; i++)
		{
			checkBox1.click();
			boolean checBox1State = checkBox1.isSelected();
			
			if (checBox1State == true)
			{
				System.out.println("ChceckBox1 is Selected");
			}
			
			else
			{
				System.out.println("CheckBox1 is not selected");
			}
			
			checkBox2.click();
			boolean checBox2State = checkBox2.isSelected();
			
			if (checBox2State == true)
			{
				System.out.println("CheckBox2 is selected");
			}
			
			else 
			{
				System.out.println("CheckBox2 is not selected");
			}
			
		}
		
		checkBox3.click();
		boolean checkBox3State = checkBox3.isSelected();
		if (checkBox3State == true)
		{
			System.out.println("CheckBox3 is selected");
		}
		
		else 
		{
			System.out.println("CheckBox3 is not selected");
		}
			
		}
		
	
}
