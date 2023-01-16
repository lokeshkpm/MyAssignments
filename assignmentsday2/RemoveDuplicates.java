package assignmentsday2;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		String text = "abc abc def def def xyz";
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Before removing duplicates: "+"\n"+text);
		String [] textArray = text.split(" ");
		String newtext = ""; 
		for (int i = 0; i < textArray.length; i++) {
			int count = 0;
			for (int j = i+1; j <textArray.length; j++) {
				if (textArray[i].equals(textArray[j]))
				{
					
					count = 1 ;
//  				System.out.println(textArray[i]);
			}
		}
			if (count!=1)
			{
			newtext =newtext +textArray[i]+" ";				
					
			}	
		
		}
		
		System.out.println("After removing duplicates: "+"\n"+newtext);
		
	}

}
