package gfg;

import java.util.*;

public class RotateArrayClockWise {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int arr[] = new int[n];
			int newArray[]= new int[n];
			for (int i = 0 ; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			int i = 0;
			int rP = d; //rp --> Rotating point
			while(rP < n) {
				newArray[i] = arr[rP];
				i++;
				rP++;
			}
			int rp = 0; 
			while (rp < d) {
				newArray[i] = arr[rP];
				i++;
				rP++;
			}
			for (int k : newArray) {
				System.out.println(k+ " ");
			}
		}	
	}
}
