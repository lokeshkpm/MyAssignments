package assignmentsday2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		String result = "";
		
		for (int i=0; i<charArray.length; i++) {
			
			char c = charArray[i];
			
			if (i % 2!= 0) {
				c = Character.toUpperCase(charArray[i]);				
			}
			result = result + c;
		}
		System.out.println("Given String: "+test);
		System.out.println("Odd Index to upper case of string: "+result);
		}
	}

	

