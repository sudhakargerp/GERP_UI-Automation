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

public class mar22TestNGTest {
  
	@Test
	public void mainTest1() 
	{
		System.out.println("This is my TestNG class 1 Test");
	}
	
	@Test
	public void mainTest2() 
	{
		System.out.println("This is my TestNG class 2 Test");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("This is Before Method Annotation");
	}

  
	@AfterMethod
  
	public void afterMethod() 
	{
		System.out.println("This is After Method Annotation");
	}

  
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("This is Before Class Annotation");
	}

 
	@AfterClass
  
	public void afterClass() 
	{
		System.out.println("This is After Class Annotation");
	}

  
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("This is Before Test Annotation");
	}

  
	@AfterTest
	public void afterTest() 
	{
		System.out.println("This is After Test Annotation");
	}

  
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("This is Before Suite Annotation");
	}

  
	@AfterSuite
	public void afterSuite() 
  	{
		System.out.println("This is After Suite Annotation");
	}

}
