package nsutTest;

import java.util.HashMap;
import java.util.Scanner;

public class hash {
	
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 String st = s.nextLine();
		 int n = st.length();
		 int max = 0;
		 String ans = "";
		 HashMap<Character , Integer> hp = new HashMap<>();
	     
	        for(int i = 0 ; i < n ; i++){
	            if(hp.containsKey(st.charAt(i))){
	                hp.put(st.charAt(i) , hp.get(st.charAt(i)) + 1);
	            }
	            else {
	                hp.put(st.charAt(i) , 1);
	            }
	            
	            if(max < hp.get(st.charAt(i))) {
	            	max = hp.get(st.charAt(i));
	            }
	        }
		
	        while(max > 0) {
	        	for(int i = 0 ; i < n ; i++){
	        		if(hp.get(st.charAt(i)) == max){
		                ans += st.charAt(i);
		                hp.put(st.charAt(i), -1);
		            }
	        	}
	        	
	        	max--;
	        }
	        
	        System.out.println(ans);
		
	}

}
