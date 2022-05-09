package mar22.week4.day7.WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get in to the WebTable
		WebElement webTable = driver.findElement(By.id("table-content"));
		//driver.findElement(By.tagName("table"));
		
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		//WebElement firstTableRow = tableRows.get(1);
		//String firstTableRowValue = firstTableRow.getText();
		//System.out.println(firstTableRowValue);
		//System.out.println(tableRows.size());
		
		for (int i=1; i<tableRows.size(); i++)
		{
			WebElement tableRow = tableRows.get(i);
			List<WebElement> allColumns = tableRow.findElements(By.tagName("td"));
			
			for (int j=0; j <allColumns.size(); j++)
			{
				String columnValue = allColumns.get(j).getText();
				System.out.println(columnValue);
				
			}
		}
		
		
		//int columSize = allColumns.size();
		
		
		
		
		
		driver.close();
	}

}
