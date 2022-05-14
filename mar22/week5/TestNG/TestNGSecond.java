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

public class TestNGSecond {
  
	@Test
  public void secondTestNG() 
  {
		System.out.println("This is my Second TestNG Class");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("This is my Second before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("This is my Second After Method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("This is my Second Before Class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This is my Second After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("This is my Second Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("This is my Second After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("This is my Second Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is my Second After Suite");
  }

}
