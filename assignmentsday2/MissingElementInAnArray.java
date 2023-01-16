package assignmentsday2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
				int[] arr = {10,1,2,3,4,7,9,5,8,0};
				System.out.print("Before Sort: ");
				for(int i = 0; i<arr.length; i++) {					
					System.out.print(arr[i]+" ");
				}
				
				Arrays.sort(arr);				
				System.out.print("\n"+"After Sort: ");
				for(int i = 0; i<arr.length; i++) {					
					System.out.print(arr[i]+" ");
				}
				
				System.out.print("\n"+"Missing Element in Array: ");
				for(int i = 0; i<arr.length; i++) {		
						if(i != arr[i]) {
							System.out.print(i);
							break;
						}
					}
					
				}
}

	

					

	


