package tcs;

import java.util.*;

public class MyClass3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int B[] = new int[m];
		for(int i = 0 ; i < m ; i++) {
			B[i] = sc.nextInt();
		}
		
		int j = 0;
		int k = 0;
		int c = 0;
		boolean ac = false;
		if(A[0] < B[0]) {
			ac = true;
		}
		while(j < n && k < m) {
			if(ac) {
				if(A[j] > B[k]) {
					ac = false;
					c++;
				}
				else {
					j++;
				}
			}
			else {
				if(A[j] < B[k]) {
					ac = true;
					c++;
				}
				else {
					k++;
				}
			}
		}
		System.out.println(c + 1);

	}

}
