package mar22.week5.day10.TestNG;

import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.reporters.jq.Main;

public class LearnReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		LearnReadingDataFromExcel lrexcel = new LearnReadingDataFromExcel();
		lrexcel.readData();
	}
	
	public String[][] readData() throws IOException
	{
		//Step1: Get in to the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ErailStation.xlsx");
		
		//Step2: Get in to the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		for (int i=1; i<=ws.getLastRowNum(); i++)
		{
			//Step3: Get in to the Row
			XSSFRow row = ws.getRow(i);
			
			for (int j=0; j<=row.getLastCellNum(); j++)
			{
				XSSFCell cell = row.getCell(j);
				
				System.out.println(cell);
					
			}
				
		}
		
		wb.close();
		return readData();
		
	}

}
