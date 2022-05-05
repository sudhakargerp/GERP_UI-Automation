package mar22.week3.day6.ListAndSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

public static void main(String[] args) {
		
		Set<String> setValues = new TreeSet<String>();
		
		boolean add = setValues.add("Sudhakar");
		System.out.println(add);
		boolean add2 = setValues.add("Ritu");
		System.out.println(add2);
		boolean add3 = setValues.add("Ami");
		System.out.println(add3);
		boolean add4 = setValues.add("Nur");
		System.out.println(add4);
		boolean add5 = setValues.add("Amisha");
		System.out.println(add5);
		boolean add6 = setValues.add("Nur");
		System.out.println(add6);
		
		
		System.out.println(setValues.size());
		
		
		List<String> listValues = new ArrayList<String>(setValues);
		
		for (int i=0; i<listValues.size(); i++)
		{
			System.out.println(listValues.get(i));
		}
		
		
		/*
		 * for (int i=2; i<setValues.size(); i++) {
		 * System.out.println(setValues.get(i)); }
		 */
		 
		 

		for (String object : setValues) {
			System.out.println(object);
			
		}

		//Sort in Ascending Order
				//Collections.sort(setValues);
				
				//To remove any value of the ArrayList
		
				/*
				 * boolean remove2 = setValues.remove(setValues); //boolean remove =
				 * setValues.remove(setValues); System.out.println(remove2);
				 */
				
			
				System.out.println(setValues.size());
				
				
				/*
				 * for (int i=setValues.size()-1; i>=0; i--) {
				 * System.out.println(setValues.get(i)); }
				 */

	}


}
