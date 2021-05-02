package sorting;

import java.util.Scanner;

public class Try1 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println(" Enter the no. of elements in array ");
		int n = sc.nextInt();
		
		int temp; 
		int a[] = new int[n];
		System.out.println(" Enter the values of elements in array ");
		for (int i = 0 ; i < n ; i++) {
			a[i]= sc.nextInt();
		}
		for (int j = 0 ; j < n ; j++) {
			for (int i = 0 ; i < n ; i++) {
			
				if (a[j] <= a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				
				} 
			}
			for (int k = 0 ; k < n ; k++) {
				System.out.print(a[k]+" ");
			}
			System.out.println();
			
		}
		
		for (int k = 0 ; k < n ; k++) {
			System.out.print(a[k]+" ");
		}
	}

}
