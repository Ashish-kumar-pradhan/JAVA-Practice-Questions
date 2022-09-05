package tcs;

import java.util.*;

public class MyClass4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.nextLine();
		HashMap<Character , Integer> hp = new HashMap<>();
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			char c = S.charAt(i);
			if(hp.containsKey(c)) {
				hp.put(c, hp.get(c) + 1);
			}
			else {
				hp.put(c, 1);
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			char c = S.charAt(i);
			if(hp.get(c) >= 2) {
				hp.put(c, hp.get(c) - 2);
				count++;
			}
		}
		
		System.out.println(count);

	}

}
