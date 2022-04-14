package mar22.week1.day2;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnArray {

	public static void main(String[] args) {
		
		/*
		 * int[] nums = new int[6];
		 * 
		 * nums[0] = 10; nums[1] = 20; nums[2] = 30; nums[3] = 40; nums[4] = 50; nums[5]
		 * = 60;
		 */
		
		int[] nums = {70,20,50,30,10,90};
		
		// to get the size of the array - nums.length
		System.out.println(nums.length);
		
		//to get the last index
		int lastIndex = nums.length-1;
		System.out.println(lastIndex);
		
		Arrays.sort(nums);
		for (int i=lastIndex; i>=0; i--)
		{
			System.out.println(nums[i]);
		}
		
	}
	

}
