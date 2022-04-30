package mar22.week3.day5.String;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnString {
	
	//Global Variable can be accessed anywhere within or outside the class and further depend on accessSepicifier type
	//String input  = "Welcome";
	//String newInput = "Home";

	
	public void takeVideo()
	{
		//local variable which is accessible only within the method 
		String lens = "Super QUality";
		System.out.println(lens);
		
	}

	public static void main(String[] args) {
		LearnString str = new LearnString();
		String input  = "Welcome Hom";
		String secondInput = "Welcome1234";
		int number = 10;
		String newInput = "HOME";
		
		//Same datatype use .concat()
		System.out.println(input.concat(newInput));
		
		//different data type use + symbol
		System.out.println(input+number);
		
		//if newInput value contains input value then true, else false
		System.out.println(input.contains(newInput));
		
		System.out.println(input.toUpperCase());
		System.out.println(newInput.toLowerCase());
		
		System.out.println(input.replace("e", ""));
		
		System.out.println(secondInput.replaceAll("[^0-9]", ""));
		
		System.out.println(secondInput.replaceAll("[0-9]", ""));
				
		System.out.println(input.charAt(2));
		str.takeVideo();

	}

}
