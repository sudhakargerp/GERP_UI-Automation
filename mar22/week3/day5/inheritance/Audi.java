package mar22.week3.day5.inheritance;

public class Audi extends Car {
	
	public void sideSensor()
	{
		System.out.println("This is the child class - sideSensor()");
	}

	public static void main(String[] args) {
		
		Audi audiCar = new Audi();
		audiCar.sideSensor();
		audiCar.airConditioner();
		audiCar.applyBrake();
		audiCar.applyHorn();

	}

}
