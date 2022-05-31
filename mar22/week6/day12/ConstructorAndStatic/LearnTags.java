package mar22.week6.day10.ConstructorAndStatic;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnTags {
	
	@Test (groups ={"functional", "smoke"})
	public void login() {
		System.out.println("This is login method");
		throw new NoSuchElementException();
	}
	
	@Test (groups = "functional", dependsOnGroups ="smoke")
	public void createOrder() 
	{
		System.out.println("This is Create Order method");
	}
	
	@Test (groups = "functional", dependsOnGroups ="smoke")
	public void updateOrder() {
		System.out.println("This is Update Order method");
	}
	
	@Test (groups = {"functional"}, dependsOnGroups ="smoke")
	public void deleteOrder() {
		System.out.println("This is Delete Order method");
	}
	
	@Test (groups = "regression")
	public void report() {
		System.out.println("This is Report method");
	}
	
	@Test (groups = "regression")
	public void graph() 
	{
		System.out.println("This is Graph method");
	}
	

}
