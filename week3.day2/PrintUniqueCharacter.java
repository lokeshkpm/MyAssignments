package assignments.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * a) Take your name as input b) Print all unique characters only (any order)
		 * 
		 * Input: babu Output: a u
		 * 
		 */
		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array b) Create a new Set -> HashSet c) Add
		 * each character to the Set and if it is already there, remove it d) Finally,
		 * print the set
		 * 
		 */
		String text = "babu";
		char[] charArray = text.toCharArray();
		Set<Character> input = new HashSet<Character>();		
		
		for (char i:charArray) {
			 if(input.contains(i))
		        {
				 input.remove(i);				
		            
		        }
		        else
		        {
		            
		        	input.add(i);
		        	
		        }
		    }
			System.out.println("Given Text is: "+text); 
		    System.out.println("unique characters are: "+input); 
		}
			
	}
