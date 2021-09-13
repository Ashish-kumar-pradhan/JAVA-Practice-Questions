package extra;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr1 = new int[n]; 
		int[] arr2 = new int[n]; 
		
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		for(int i = 0 ; i < n ; i++) {
			sum = sum + arr1[i] - arr2[i]; 
			if(sum > max) max = sum;
		}
		
		System.out.println(max);

	}

}
