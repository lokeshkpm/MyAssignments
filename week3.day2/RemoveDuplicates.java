package assignments.week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		Declare a String as "PayPal India"
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print it
		
		String text ="PayPal India";
		char[] charArray = text.toCharArray();
				
		Set <Character> charSet = new LinkedHashSet<Character>();
		Set <Character> dupCharSet = new HashSet<Character>();
		
		
		for (char i : charArray) {
			if (!charSet.add(i)) {
				dupCharSet.add(i);
				
				//dupCharSet.remove(i);
			}
		}	
			for (char j : charSet) {
				if (j!=' ') {
					System.out.print(j);
				}
}
}
}
