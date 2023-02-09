package assignments.week3.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * There will be running number between 1 to 10 
		 * One of the unique number will be missing
		 * Find the missing number 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set 
		 * b) Make sure the set is in the ascending order 
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
	//	int[] nums = {10,5,1,2,3,1,4,7,9,5,8,1,10};
		int[] nums = {4,3,2,5,1,3,7,8,9,10};
		
		Set<Integer> input = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			input.add(nums[i]);
			
		}
		System.out.println(input);
		
		
		List<Integer> num=new ArrayList<Integer>(input);	
		
		for (Integer integer : input) {
			num.add(integer);
		}
		
		//int count =1;
		for (int j=0; j<(num.size())-1;j++) {
			if (num.get(j)!=j+1) {
				
				//count++;
				System.out.println(j+1);
				break;
			}
			
		}
//		int size = nums.length+1;
//		int sum = (size*(size+1))/2;
//		int restSum = 0;
//		
//		for (int n :nums) {
//	            restSum += n;
//	    }
//	        int missingNumber = sum - restSum;
//	        System.out.println(missingNumber);
}
}
