package tcs;

import java.util.Scanner;

public class MyClass7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long n = Math.max(a, b);
		long am = 0;
		long bm = 0;
		
		for(long i = 2 ; i <= n ; i++) {
			boolean p = true;
			long sq = (long)Math.sqrt(i);
			for(long j = 2 ; j <= sq ; j++) {
				if(i % j == 0) {
					p = false;
					break;
				}
			}
			if(p && i <= a) {
				am = i;
			}
			if(p && i <= b) {
				bm = i;
			}
		}
		
		System.out.println(am - bm);
		

	}
	
	

}
