package pra;

import java.util.Collections;
import java.util.List;

public class MyClass6 {
	
	public static long solution(List<Long> arr) {
		int n = arr.size();
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(min > arr.get(i)) {
				min = arr.get(i);
			}
			if(max < arr.get(i)) {
				max = arr.get(i);
			}
		}
		return max-min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
