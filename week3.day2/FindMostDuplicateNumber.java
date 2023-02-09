package assignments.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// Find the most duplicate number -> First most duplicate
		/*
		 * input: abbaba output: b
		 */

		/*
		 * Psuedocode * a) Map -> HashMap b) String -> ch[] -> Get all the character ->
		 * occurance c) Keep comparing the occurance with other values -> max value ->
		 * character
		 * 
		 */
		String input = "abbaa";
		int maxValue = 0;
		char maxOccurance = input.charAt(0);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
			if (map.get(charArray[i]) > maxValue) {
				maxOccurance = charArray[i];
				maxValue = map.get(charArray[i]);
			}
		}
		System.out.println(maxOccurance);
	}
}