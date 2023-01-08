package week1.day1;

	public class IsPrime {
	
		public static void main(String[] args) {
			
			int number = 41;
		    boolean flag = true;
		    for (int i = 2; i <= number-1 ; i++) {
		       
		    	if (number % i == 0) {
		        flag = false;
		        break;
		      }
		    	
		    }
	
		   if(flag)
		      System.out.println("Given number " + number +" is a prime!");
		    else
		      System.out.println("Given number " + number +" not a prime!");
		}
	
	}
