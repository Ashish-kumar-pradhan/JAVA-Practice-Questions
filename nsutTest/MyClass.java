package nsutTest;

import java.util.Scanner;

public class MyClass {

	public static void count(int n , int arr[]) {
		 if(n < 0) {
			 return;
		 }
		 if(n == 0) {
			 arr[0]++;
			 return;
		 }
		 
		 count(n-1 , arr);
		 count(n-2 , arr);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[1];
		count(n , arr);
		System.out.println(arr[0]);
		
	}

}
