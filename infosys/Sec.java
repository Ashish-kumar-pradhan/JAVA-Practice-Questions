package infosys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sec {
	
	public static int minOperation(int N , List<Integer> A) {
		
		Collections.sort(A);
		
		int c = 0;
		int i = 0;
		int j = A.size()-1;
		while(i <= j) {
			if(i == j) {
				c = c + 1;
				
			}
			else if(A.get(i) == A.get(j)) {
				c = c + 2;
			}
			else {
				c = c + 1;
			}
			
			i++;
			j--;
		}
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(2);
		arr.add(2);
		
		arr.add(2);
		arr.add(3);
		arr.add(3);
		System.out.println(minOperation(6, arr));

	}

}
