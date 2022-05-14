package mar22.week5.day9.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGFirst {
  
	@Test
	public void testngFirst() 
	{
		System.out.println("This is my first TestNG Class");
	}
  
	@BeforeMethod
  
	public void beforeMethod() 
	{
		System.out.println("This is my first Before Method");
	}
	

  
	@AfterMethod
  
	public void afterMethod() 
	{
		System.out.println("This is my first After Method");
  
	}

  @BeforeClass
  
  	public void beforeClass() 
  	{
	  System.out.println("This is my first Before Class");
  	}

  
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This is my first After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("This is my first Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("This is my first After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("This is my first Before Suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("This is my first After Suite");
  }

}
