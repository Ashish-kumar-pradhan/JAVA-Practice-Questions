package extra;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number of Subjects ");
		byte n = sc.nextByte();
		
		int[] arr = new int[n]; 
		System.out.println("Enter the marks ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		float sum = 0f;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Total marks is "+sum+"/"+n*100);
		System.out.println("Percentage is "+sum/n);
	
	}

}
