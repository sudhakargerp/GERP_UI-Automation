package mar22.week3.day6.abstraction;

public class ICICIBank implements CIBIL {

	public void savingsAccount() {
		
		System.out.println("5%");
	}

	public void fixedDeposit() {
		
		System.out.println("7%");
		
	}
	
	public void eduLoan()
	{
		System.out.println("50000");
	}
	
	public void creditScore() {
		System.out.println("830");
		
	}
	
	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		bank.fixedDeposit();
		bank.savingsAccount();
		bank.eduLoan();
		bank.creditScore();

	}

	

	


}
