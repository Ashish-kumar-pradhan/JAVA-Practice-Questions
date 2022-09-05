package tcs;

import java.util.*;

public class MyClass1 {
	
	
	public static void PS(ArrayList<String> arr, int n , ArrayList<String> ans){
			
			int size = (int)Math.pow(2, n);
			
			for(int i = 0; i < size ; i++){
			     for(int j = 0; j < n; j++){
			         if((i & (1 << j)) > 0) {
			        	 System.out.print(arr.get(j)+",");
			         }
			     }
			     System.out.println();
			}
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> ans = new ArrayList<>();
		String S = sc.nextLine();
		String m = "";
		for(int i = 0 ; i < S.length() ; i++) {
			if(S.charAt(i) == ',') {
				arr.add(m);
				m = "";
			}
			else {
				m = m + S.charAt(i);
			}
		}
		if(m.length() != 0) {
			arr.add(m);
		}
		
		PS(arr , n , ans);

	}

}
