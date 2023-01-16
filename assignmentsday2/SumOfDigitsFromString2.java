package assignmentsday2;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		System.out.println("Given Text: "+text);
		char[] charArray = text.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if (!(Character.isDigit(charArray[i])))
			{
				sum =sum +Character.getNumericValue(charArray[i]);
			}
			
		}
		
		System.out.println("Sum of Digits from String: "+sum);
	}

}
