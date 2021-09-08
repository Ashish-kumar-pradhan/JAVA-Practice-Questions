package nsutTest;

import java.util.Scanner;

public class Digdiff {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		int l = 0;
		int r = 0;
		for(int i = 0 ; i < n ; i++) {
			l += arr[i][i];
			r += arr[i][n-1-i];
		}
		
		System.out.println(Math.abs(l-r));

	}

}
