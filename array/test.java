package array;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int n = s.length();
		int c = 0;
		int in = 0;
		for(int i = 0 ; i < n ; i++) 
		{
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				in++;
			}
			else {
				c++;
			}
		}
		System.out.println("charcters = " + c );
		System.out.println("Integers = " + in);

	}

}
