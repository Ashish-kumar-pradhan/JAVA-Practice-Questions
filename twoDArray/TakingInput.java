package twoDArray;

import java.util.Scanner;

public  class TakingInput {
	
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
	

	public static void main(String[] args) {
		int[][] twoDArray = takeInput();
		printTwoDArray(twoDArray);

	}

}
