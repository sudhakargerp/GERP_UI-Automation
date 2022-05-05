package mar22.week3.day6.ListAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		
		List<Character> listValues = new ArrayList<Character>();
		
		System.out.println(listValues.size());
		
		listValues.add('a');
		listValues.add('b');
		listValues.add('c');
		/*
		 * listValues.add(400); listValues.add(500); listValues.add(600);
		 * listValues.add(700);
		 */
		
		System.out.println(listValues.size());
		
		for (int i=0; i<listValues.size(); i++)
		{
			System.out.println(listValues.get(i));
		}
		

		//Sort in Ascending Order
		//		Collections.sort(listValues);
				
				//To remove any value of the ArrayList
				listValues.remove(2);
				
				//listValues.remove(2);
				System.out.println(listValues.size());
				for (int i=listValues.size()-1; i>=0; i--)
				{
					System.out.println(listValues.get(i));
				}

	}

}
