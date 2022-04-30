package mar22.week3.day5.inheritance;

public class BMW extends Car {
	
	public void gps()
	{
		System.out.println("This is child class - gps()");
	}

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.gps();
		bmw.airConditioner();
		bmw.applyBrake();
		bmw.applyHorn();	

	}

}
