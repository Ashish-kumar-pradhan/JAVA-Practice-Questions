package pra;

import java.util.*;

public class MyClass4 {
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0;
		int s = 0;
		int i = 0;
		while(true) {
			if((int)Math.pow(3, i) > n) {
				break;
			}
			else {
				n = n - (int)Math.pow(3, i);
				f = f + (int)Math.pow(3, i);
				i++;
			}
			
			if((int)Math.pow(4, i) > n) {
				break;
			}
			else {
				n = n - (int)Math.pow(4, i);
				s = s + (int)Math.pow(4, i);
				i++;
			}
		}
		
		System.out.println(f + " " + s);
    }

}
