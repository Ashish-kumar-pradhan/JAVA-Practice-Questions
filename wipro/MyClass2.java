package wipro;

import java.util.*;
public class MyClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int arr[] = new int[256];
		for(int i = 0 ; i < n ; i++) {
			arr[s.charAt(i)]++;
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[s.charAt(i)] == 1) {
				System.out.println(i+1);
			}
		}
		
		

	}

}
