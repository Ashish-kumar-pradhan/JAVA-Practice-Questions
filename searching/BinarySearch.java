package searching;

import java.util.Arrays;

public class BinarySearch {
	
	public static void binarySearch(int arr[] , int n ) {
		
//		Arrays.sort(arr);
		
		int si = 0;
		int ei = arr.length-1;
		int midI = 0;
		
		while((ei-si)>-2) {
			
			if ((ei-si)==-1) {
				System.out.println("the value is not present ");
				break;
			} else {
				midI = (si + ei)/2;
				if(arr[midI] == n) {
					System.out.println(midI);
					break;
				} else {
					if (arr[midI]>n) {
					   ei = midI - 1;
					} else{
					    si = midI + 1; 
				
					}
					
				}
			}
			
			
//			System.out.println(si + "  "+ ei);
		}

		
	}

	public static void main(String[] args) {
		
		int a[] = {1 , 2 ,3 , 4 , 5 , 7 , 8 };
		
		binarySearch(a , 7);

	}

}
