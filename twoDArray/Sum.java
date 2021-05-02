package twoDArray;

import java.util.Scanner;

public class Sum {
	
public static int[][] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int colms = sc.nextInt();
		
		int[][] twoDarr = new int[rows][colms];
		
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j < colms ; j++) {
				System.out.println("enter the value of "+i+" Row "+j+" Column");
				twoDarr[i][j] = sc.nextInt();
			}
		}
		return twoDarr;
		
}

public static void printTwoDArray(int[][] arr){
	for(int i = 0 ; i < arr.length ; i++ ) {
		for(int j = 0 ; j < arr[0].length ; j++) {
			
			System.out.print(arr[i][j] + " ");
			
		}
		System.out.println();
	}
}

	
	public static void sumOfRows(int arr[][]) {
		for(int i = 0 ; i < arr.length ; i++ ) {
			int sum = 0;
			for(int j = 0 ; j < arr[0].length ; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("The sum of "+i+" Row "+sum );
		}
	}
	
	public static void sumOfColumns(int arr[][]) {
		for(int j = 0 ; j < arr[0].length ; j++ ) {
			int sum = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				sum = sum + arr[i][j];
			}
			System.out.println("The sum of "+j+" Coloumn "+sum );
		}
	}
	
	
	public static void totalSum(int arr[][]) {
		int total = 0;
		for(int i = 0 ; i < arr.length ; i++ ) {
			int sum = 0;
			for(int j = 0 ; j < arr[0].length ; j++) {
				sum = sum + arr[i][j];
			}
			total = total + sum;
		}
		System.out.println("the Total sum is "+total);
	}


	public static void main(String[] args) {
		
		int array[][] = takeInput();
		printTwoDArray(array);
		System.out.println();
		sumOfRows(array);
		System.out.println();
		sumOfColumns(array);
		System.out.println();
		totalSum(array);
		
		
	}

}
