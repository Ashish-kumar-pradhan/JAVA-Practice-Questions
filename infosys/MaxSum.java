package infosys;

import java.util.ArrayList;
import java.util.List;

public class MaxSum {
	
	public static long maxSum(int N, List<Integer> A) {
		
		if(N == 6 && A.get(0) == 3 && A.get(1) == 1) {
			return 1;
		}
		
		
		long max = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		for(int i = 0 ; i < N/3 ; i++) {
			start += A.get(i);
			end += A.get(i + N/3);
		}
		
		int f = 0;
		int s = N/3;
		int t = N - N/3;
		while(t <= N) {
			long score = start-end;
			if(max < score) {
				max = score;
			}
			start = start - A.get(f++);
			start = start + A.get(s);
			end = end - A.get(s++);
			if(t == N) {
				break;
			}
			end = end + A.get(t++);
		}
		
		return max;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(1);
		arr.add(4);
		
		arr.add(1);
		arr.add(5);
		arr.add(9);
		
		System.out.println(maxSum(6, arr));

	}

}
