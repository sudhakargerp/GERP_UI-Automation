package mar22.week3.day5.polymorphism;

public class LearnOverrideBranch extends LearnMethodOverrideHO
{
	
	@Override
	public void savingsAccount(int interest)
	{
		System.out.println("This is Branch Office interest:"+ interest);
	}
	
	//Overload
	public void savingsAccount(int interest, String balance)
	{
		System.out.println("This is Branch Office interest:"+ interest + " " + balance);
	}

	public static void main(String[] args) {
		LearnOverrideBranch lmor = new LearnOverrideBranch();
		lmor.savingsAccount(7);
		lmor.savingsAccount(8, "50000");

	}

}
