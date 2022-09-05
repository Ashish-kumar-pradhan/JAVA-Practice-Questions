package wipro;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int newSize = (size+1)/2;
		int sumArray[] = sum(arr , size , newSize);
		
		for(int i = 0 ; i < newSize ; i++) {
			System.out.print(sumArray[i] + " ");
		}

	}

	private static int[] sum(int[] arr, int size, int newSize) {
		
		
		int newArray[] = new int[newSize];
		int j = 0;
		for(int i = 0 ; i < newSize ; i++) {
			newArray[i] += arr[j++];
			if(j >= size) {
				break;
			}
			newArray[i] += arr[j++];
		}
		
		return newArray;
		
	}

}
