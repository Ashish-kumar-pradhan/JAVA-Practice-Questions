package pra;

import java.util.*;

public class MyClass3 {
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int high = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
        for(int i =0 ; i<n ; i++) {
			for(int j = 0; j<n-1 ; j++) {
				
				if (arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		
		int start = 0;
		boolean st = true;
		int end = 0;
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] == high) {
				if(st) {
					start = i;
					st = false;
				}
				end = i;
			}
		}
		
		if(start == 0 && end == 0) {
			System.out.println("Not found");
		}
		else {
			
			System.out.println(start + " " + end);
		}
		
	}

}
