package assignments.week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		// int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		// 
		// output= 7;

		/*
		 * Pseudo Code: a) Create a empty Set Using TreeSet b) Declare for loop iterator
		 * from 0 to data.length and add into Set c) converted Set into List d) Print
		 * the second last element from List
		 */
		
		//int[] data = { 1,2,4,5,1,2,3,8,5 };
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> input = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			input.add(data[i]);
		}
		int size = input.size();
		System.out.println("Size of Tree Set is: "+size);
		System.out.println("Elements in Tree set are: "+input);
		List<Integer> arr = new ArrayList<>(input);
		System.out.println("Second last element from List is : "+arr.get(size-2));
	}

}
