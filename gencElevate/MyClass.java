package gencElevate;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
	
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = n - a*b;
		
		if(a > b) {
			a = 0;
		}
		else {
			b = 0;
		}
		
		System.out.println(a + " " + b + " " + c);
		

	}

}
