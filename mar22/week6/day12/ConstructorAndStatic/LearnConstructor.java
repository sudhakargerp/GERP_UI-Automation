package mar22.week6.day10.ConstructorAndStatic;

public class LearnConstructor {
	
	static int id;
	static String name;
	static String company;
	
	public LearnConstructor(int empId, String empName, String empCompany)
	{
		System.out.println("This is constructor");
		id = empId;
		name = empName;
		company = empCompany;
		
		}
	
	/*
	 * public void learnMethod(int empId, String empName, String empCompany) { id =
	 * empId; name = empName; company = empCompany; }
	 */
	
	public static void main(String[] args) {
		new LearnConstructor(100, "Sudhakar", "Amazon");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(company);
	
		//lc.learnMethod(200, "Sudhakar", "Amazon");
						
		new LearnConstructor(200, "Senthil", "GERP");
		
	}

}
