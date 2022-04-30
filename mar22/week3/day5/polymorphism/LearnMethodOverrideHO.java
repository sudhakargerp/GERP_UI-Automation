package mar22.week3.day5.polymorphism;

public class LearnMethodOverrideHO {

	public void savingsAccount(int interest)
	{
		System.out.println("Saving Account Interest in MedhodOverride Class" + interest);
	}
	
	
	
	public static void main(String[] args) {
		LearnMethodOverrideHO lmor = new LearnMethodOverrideHO();
		lmor.savingsAccount(5);

	}

}
