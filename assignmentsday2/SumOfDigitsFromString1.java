package assignmentsday2;

public class SumOfDigitsFromString1 {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String newtext = text.replaceAll("[0-9]","");		
		System.out.println("Given Text: "+text);
		System.out.println("Replaced Text without digits: "+newtext);
		char[] charArray = newtext.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			sum = sum + Character.getNumericValue(charArray[i]);
			
		}
		
		System.out.println("Sum of Digits from String: "+sum);
	}

}
