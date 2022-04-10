package mar22.week1.day1;

// AccessSpecifier Class ClassName
public class Bus {
	
	public static String color = "Red";

	// AccessSpecifier returnType methodName
	public void driveCar() {
		color = "Black";
		System.out.println(color);
		System.out.println("Drive Car");
	}
	
	public void applyBrake() {
		System.out.println(color);
		System.out.println("Apply Brake");
	}
	
	public static void main(String[] args) {
		System.out.println("In the main method");
		Bus myCar = new Bus();
		System.out.println(myCar.color);
		myCar.driveCar();
		myCar.applyBrake();
		System.out.println(color);
		System.out.println(myCar.color);
	}
	
}
