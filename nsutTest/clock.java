package nsutTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class clock {
	
	
	public static int find_pivot_index(List<Integer> arr , int n) {
		Stack<Integer> min = new Stack<>();
		Stack<Integer> max = new Stack<>();
		
		max.push(arr.get(0));
		for(int i = 1 ; i < n ; i++) {
			while(max.size() != 0 && max.peek() > arr.get(i)) {
				max.pop();
			}
			max.push(arr.get(i));
		}
		
		min.push(arr.get(n-1));
		for(int i = n-2 ; i >= 0 ; i--) {
			while(min.size() != 0 && min.peek() < arr.get(i)) {
				min.pop();
			}
			min.push(arr.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
		while(max.size() != 0) {
			ar1.add(max.pop());
		}
		while(min.size() != 0) {
			ar2.add(min.pop());
		}
		
		int val = 0;
		for(int i = 0 ; i < ar1.size() ; i++) {
			for(int j = 0 ; j < ar2.size() ; j++) {
				if(ar1.get(i) == ar2.get(j)) {
					val = ar1.get(i);
					break;
				}
			}
		}
		
		int index = -1;
		for(int i = 0 ; i < arr.size() ; i++) {
			if(arr.get(i) == val) {
				index = i;
				break;
			}
		}
		
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
