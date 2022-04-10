package mar22.week1.day1;

//accessSpecifier keyword ClassName

public class Car {

	// Global Variable - If variables are declared in a Class but outside method
	public static String bodyColor = "Red";

	public static void main(String[] args) {

		// ClassName ObjectName = new ClassName();
		Car Toyota = new Car();
		System.out.println(bodyColor);
		Toyota.applyBrake();
		Toyota.applyHonk();
		System.out.println(bodyColor);
		
	}

	// accessSpecified returType MethodName
	public void applyBrake() {
		// local Variable
		int numberOfSeats = 4;
		
		System.out.println("This is applyBrake Method");
		System.out.println(numberOfSeats);
		System.out.println(bodyColor);
		
	}

	public void applyHonk() {
		System.out.println("This is applyHonk method");
		bodyColor = "Black";
		System.out.println(bodyColor);
	}
}
