package assignmentsday2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test =  "i am a software tester";
//		String test =  "abc def ijk lmn xyz";
		String[] testArray = test.split(" ");
		String newtext = "";
		char temp;
		for (int i = 0; i < testArray.length; i++) {
			if (i % 2!= 0)
			{
				char[] nameArray= testArray[i].toCharArray();
				for (int j = nameArray.length-1; j >=0; j--) {
					temp =nameArray[j];
					newtext =newtext + temp;
				}
			}
			else 
			{
				newtext = newtext+" "+ testArray[i]+" ";
			}
		}
		System.out.println(newtext);
	}
}

