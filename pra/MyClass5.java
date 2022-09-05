package pra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyClass5 {
	
	public static int minDifference(List<Integer> arr) {
		Collections.sort(arr);
		int n = arr.size();
		int sum = 0;
		for(int i = n-1 ; i > 0 ; i--) {
			sum = sum + (arr.get(i) - arr.get(i-1));
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			arr.add(sc.nextInt());
		}
		
		System.out.println(minDifference(arr));
		

	}

}
