package gencElevate;

import java.util.Scanner;

public class Gagan {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int arr[] = new int[256];
		for(int i = 0 ; i < n ; i++) {
			arr[s.charAt(i)] += 1;
		}
		
		int c = 0;
		for(int i = 0 ; i < 256 ; i++) {
			if(arr[i] == 1) {
				c++;
			}
		}
		
		System.out.println(c);
	}

}
