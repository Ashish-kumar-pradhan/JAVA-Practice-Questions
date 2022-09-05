package tcs;

import java.util.*;

public class MyClass2 {
	
	public static int find(String str, int n)
    {
 
        int cur = 0;
        int max = 0;
 
        
        for (int i = 0; i < n; i++) {
 
            cur += (str.charAt(i) == '0' ? 1 : -1);
 
            if (cur < 0) {
            	cur = 0;
            }
 
            max = Math.max(cur, max);
        }
       
        return max == 0 ? -1 : max;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.println(find(S , S.length()));

	}

}
