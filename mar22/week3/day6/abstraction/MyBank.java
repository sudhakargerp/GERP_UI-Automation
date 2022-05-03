package mar22.week3.day6.abstraction;

public class MyBank {
	
	public static void main(String[] args) {
		
		//Scope Restriction
		RBI bank = new ICICIBank();
		bank.fixedDeposit();
		
		
	}

}
