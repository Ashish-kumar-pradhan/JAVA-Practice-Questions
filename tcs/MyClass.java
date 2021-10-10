package tcs;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int sum1 = 0;
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
			sum1 = sum1 + arr1[i];
		}
		
		int m = sc.nextInt();
		int sum2 = 0;
		int arr2[] = new int[m];
		for(int i = 0 ; i < m ; i++) {
			arr2[i] = sc.nextInt();
			sum2 = sum2 + arr2[i];
		}
		int ans = -1;
		if(sum1%2 == 0 && sum2%2 == 0) {
			ans = 0;
		}
		else if(sum1%2 != 0 && sum2%2 != 0) {
			for(int i = 0 ; i < n ; i++) {
				if(arr1[i]%2 == 0) {
					ans = 1;
					break;
				}
			}
			for(int i = 0 ; i < m ; i++) {
				if(arr2[i]%2 == 0) {
					ans = 1;
					break;
				}
			}
		}
		
		System.out.println(ans);

	}

}
