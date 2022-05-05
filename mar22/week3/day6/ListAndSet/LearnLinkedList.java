package mar22.week3.day6.ListAndSet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

	public class LearnLinkedList {

		public static void main(String[] args) {
			
			List<String> listValues = new LinkedList<String>();
			
			System.out.println(listValues.size());
			
			listValues.add("Sudhakar");
			listValues.add("Ritu");
			listValues.add("Ami");
			listValues.add("Nur");
			listValues.add("Amisha");
			listValues.add("Nur");
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
					Collections.sort(listValues);
					
					//To remove any value of the ArrayList
					//listValues.remo
					
					//listValues.remove(2);
					System.out.println(listValues.size());
					for (int i=listValues.size()-1; i>=0; i--)
					{
						System.out.println(listValues.get(i));
					}

		}

}
