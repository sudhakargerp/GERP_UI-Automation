package mar22.week5.day10.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ErailDataParametrization extends ErailStationBaseClass {

	@Test (dataProvider="fetchData")
	public void getTrainStation(String fromStation, String toStation)
	{
		driver.findElement(By.id("txtStationFrom")).sendKeys(fromStation);
		driver.findElement(By.id("txtStationTo")).sendKeys(toStation);
		driver.findElement(By.id("buttonFromTo")).click();
	}
	
	@DataProvider (name ="fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] data =new String[7][2];
		data[1][0] = "Chennai Egmore";
		data[1][1] ="Mumbai Central";
		data[2][0] = "Delhi";
		data[2][1] ="Goa";
		data[3][0] = "Ahmedabad Jn";
		data[3][1] ="Lucknow";
		data[4][0] = "Chandigarh";
		data[4][1] ="Delhi";
		data[5][0] = "Thanjavur";
		data[5][1] ="Mgr Chennai Ctr";
		data[6][0] = "Ksr Bengaluru";
		data[6][1] ="BhopalJn";
		
		return data;
		
		
	}

}
