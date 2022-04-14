package mar22.week1.day2;

public class LearnSwitchStatement {

	public static void main(String[] args) {
		
		
		/*
		 * int day = 7; if (day==1) { System.out.println("Monday"); }
		 * 
		 * else if (day ==2) { System.out.println("Tuesday"); } else if (day ==3) {
		 * System.out.println("Wednesday"); } else if (day ==4) {
		 * System.out.println("Thursday"); } else if (day ==5) {
		 * System.out.println("Friday"); } else { System.out.println("Weekend"); }
		 */
		
		int day = 5;
		switch (day)
		{
		case 1:
				System.out.println("Monday");
				break;
		case 2:
				System.out.println("Tuesday");
				break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
		}
	}
}
