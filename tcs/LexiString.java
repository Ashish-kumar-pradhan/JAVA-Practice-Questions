package tcs;

import java.util.*;
public class LexiString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String l = sc.next();
		String s = sc.next();
		
		String ans = lexiString(l , s);
		
		System.out.println(ans);

	}

	private static String lexiString(String l, String s) {
		HashMap<Character , Integer> hp = new HashMap<>();
		int n = s.length();
		for(int i = 0 ; i < n ; i++) {
			if(hp.containsKey(s.charAt(i))) {
				hp.put(s.charAt(i), 1 + hp.get(s.charAt(i)));
			}
			else {
				hp.put(s.charAt(i), 1);
			}
		}
		String ans = "";
		for(int i = 0 ; i < 26 ; i++) {
			if(hp.containsKey(l.charAt(i))) {
				for(int j = 0 ; j < hp.get(l.charAt(i)) ; j++) {
					ans += l.charAt(i);
				}
			}
		}
		return ans;
	}

}
