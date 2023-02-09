package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		// get the length of the array
		// sort the array
		// Iterate it in the reverse order
		// print the array
		// Required Output: Wipro, HCL , CTS, Aspire Systems

		List<String> companies = new ArrayList<String>();
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire System");
		companies.add("CTS");
		System.out.println("Length of array list: " + companies.size());
		Collections.sort(companies);
		System.out.println("After sort: " + companies);
		System.out.println("In reverse order: ");
		for (int i = companies.size() - 1; i >= 0; i--) {
			System.out.println(companies.get(i));
		}

	}

}
