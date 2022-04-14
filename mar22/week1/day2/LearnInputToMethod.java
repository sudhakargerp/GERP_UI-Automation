package mar22.week1.day2;

public class LearnInputToMethod {

	public static void main(String[] args) 
	{
		
		LearnInputToMethod input = new LearnInputToMethod();
		
		input.getEmployeeName("Sudhakar", 10);
	}
	
	public void getEmployeeName(String empName, int empID) {
		System.out.println("Details of Employee :" +empName+ " and his id is "+ empID);
	}

}
