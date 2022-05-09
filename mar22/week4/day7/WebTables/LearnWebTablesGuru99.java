package mar22.week4.day7.WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTablesGuru99 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Get the WebTable by access Table ELement
		WebElement webTable = driver.findElement(By.tagName("table"));
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		//System.out.println(tableRows.size());
		
		for (int i=0; i<tableRows.size(); i++)
		{
			WebElement allTableRow = tableRows.get(i);
			
			List<WebElement> allColumns = allTableRow.findElements(By.tagName("td"));
			
			for (int j=0; j<allColumns.size(); j++)
			{
				String columnValue = allColumns.get(j).getText();
				System.out.println(columnValue);				
			}
		}
		
		
		driver.close();

	}

}
