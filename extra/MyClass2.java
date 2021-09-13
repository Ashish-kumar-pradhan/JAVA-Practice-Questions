package extra;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n]; 
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int z = 0;
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] == 0) {
				z++;
			}
			else if(arr[i] == 1) {
				sum = sum + z;
			}
		}
		
		System.out.println(sum);

	}

}
