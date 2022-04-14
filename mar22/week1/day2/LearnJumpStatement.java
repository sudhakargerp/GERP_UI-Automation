package mar22.week1.day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		int i;
		for (i=1; i<5; i++) 
		{
			if (i==3)
			{
				System.out.println("Three");
				break;
			}
			System.out.println(i);
		}		
		
	}
}