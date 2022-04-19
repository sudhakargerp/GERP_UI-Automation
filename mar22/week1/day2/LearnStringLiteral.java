package mar22.week1.day2;

public class LearnStringLiteral {

	public static void main(String[] args) {
		
		//String Literal / String Constant Pool
		
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1 == s2);
		
		//to get the memory address
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//Character at 0th Index of the String 
		System.out.println("First Character: "+ s1.charAt(0));
		
		//length of the String
		System.out.println("Length of S1 String is "+ s1.length());
		
		//last Character of the String
		System.out.println("Last Character of String s1 is "+ s1.charAt(s1.length()-1));
		
		for (int i=0; i<=s1.length()-1; i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		String str1 = new String("a");
		System.out.println(str1.hashCode());
		
		String str2 = new String("A");
		System.out.println(str2.hashCode());
		
				//to compare 2 values
		System.out.println("New Keyword "+ str1.equalsIgnoreCase(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str2.compareTo(str1));
		
		

	}
	
	
	public void applyBrake()
	{
		System.out.println("Test");
	}

}
