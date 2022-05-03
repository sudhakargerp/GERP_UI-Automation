package mar22.week3.day6.abstraction;

public class IndGovt extends FinanceMinistry implements RBI {

	public static void main(String[] args) {
		IndGovt gov = new IndGovt();
		gov.disasterLoan();
		gov.goldLoan();
		gov.savingsAccount();
		gov.fixedDeposit();
		gov.budget();
	}

	@Override
	public void disasterLoan() {
		System.out.println("50000");
		
	}

	public void savingsAccount() {
		System.out.println("10%");
		
	}

	public void fixedDeposit() {
		System.out.println("15%");
		
	}

	@Override
	public void budget()
	{
		System.out.println("1000000");
		
	}

	
	
}
