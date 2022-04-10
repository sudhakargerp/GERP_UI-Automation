package mar22.week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int addition=a+b;
		int subtraction=a-b;
		int multiplication=a*b;
		int quotient=a/b;
		int reminder=a%b;
		
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(quotient);
		System.out.println(reminder);
		
		int age =0;
		if (age <18) {
			System.out.println("Minor");
		}
		
		else if (age >= 18 && age <=60)
		{
			System.out.println("Major");
		}
		
		else
		{
			System.out.println("Senior");
		}
		
		if (age != 1)
		{
			System.out.println("Just Born");
		}
		
		if (a!=b || a<b) {
			System.out.println("B is less than A (or) A is not equal to B");
		}
		else {
			System.out.println("B is less than A (AND) A is not equal to B");
		}
	
	if (a!=b && b<a)
	{
		System.out.println("B is less than A (AND) A is not equal to B");
	}
	else
	{
		System.out.println("Garbage");
	}
	}
}
