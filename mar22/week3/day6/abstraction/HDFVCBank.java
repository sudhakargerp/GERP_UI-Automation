package mar22.week3.day6.abstraction;

public class HDFVCBank implements RBI {

	public void savingsAccount() {
		System.out.println("8%");
		
	}

	public void fixedDeposit() {
		System.out.println("10%");
		
	}
	
	public void agriLoan()
	{
		System.out.println("75000");
	}
	
	public static void main(String[] args) {
		HDFVCBank bank = new HDFVCBank();
		bank.fixedDeposit();
		bank.savingsAccount();
		bank.agriLoan();
	}

}
