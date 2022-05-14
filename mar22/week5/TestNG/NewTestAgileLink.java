package mar22.week5.day9.TestNG;

import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class NewTestAgileLink extends BaseClass {
 
	@Test
  
	public void agileProject() {
		
		 driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		 
  }
}
