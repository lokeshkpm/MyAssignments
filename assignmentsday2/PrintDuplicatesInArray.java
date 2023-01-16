package assignmentsday2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
//	int arr[] = {1,2,3,4,5,1,5};
	int  arr[] = {14,12,13,11,15,20,14,18,16,17,19,18,17,20};
	
	System.out.println("Given elements in Array are :");
	for (int i = 0; i<arr.length-1; i++) {
		  System.out.print(arr[i]+" ");
	}
		
	System.out.println("\nDuplicates in Array are :");
    for (int i = 0; i < arr.length-1; i++) {
    int count = 0;
    
    for (int j = i+1; j < arr.length; j++) { 
    	
    		if (arr[i] == arr[j]) {    				
     	   
    			count = 1;
     	
    		}
    }
    		 if (count!= 0)	{    		   
    		    
    			 System.out.print(arr[i]+" "); 
    		    
    			}		
    		  
    		}  	    
    	    }    
    
    	}

   
    
	


