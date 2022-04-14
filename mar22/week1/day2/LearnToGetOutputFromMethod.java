package mar22.week1.day2;

public class LearnToGetOutputFromMethod {

	public static void main(String[] args) 
	{		
		LearnToGetOutputFromMethod input = new LearnToGetOutputFromMethod();
		
		input.getEmployeeName("Sudhakar", 10);
		
		double employeeAddress = input.getEmployeeAddress();
		System.out.println(employeeAddress);
	}
	
	public void getEmployeeName(String empName, int empID) {
		System.out.println("Details of Employee :" +empName+ " and his id is "+ empID);
	}
	
	public double getEmployeeAddress() {
		 
		return 10.25; 
	}

}
