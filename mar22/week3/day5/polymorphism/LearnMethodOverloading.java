package mar22.week3.day5.polymorphism;

public class LearnMethodOverloading {
	
	public void savingsAccount(String outstandBalance)
	{
		System.out.println(outstandBalance);
	}

	public void savingAccount(int accNumber, String minimumBalance)
	{
		System.out.println(accNumber + " " + minimumBalance);
	}
	
	public void savingAccount(String accName, int chequeNumber)
	{
		System.out.println(accName + " " + chequeNumber);
	}
	
	public void savingAccount(long pin)
	{
		System.out.println(pin);
		System.out.println("THis is a test");
		System.out.println(100);
		System.out.println(100L);
		System.out.println(true);
	}
	
	public static void main(String[] args) {
		LearnMethodOverloading lmo= new LearnMethodOverloading();
		lmo.savingsAccount("10000");
		lmo.savingAccount(809011, "5000");
		lmo.savingAccount("Sudhakar", 17390372 );
		lmo.savingAccount(1010L);
	}

}
