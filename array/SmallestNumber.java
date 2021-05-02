package array;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[] = { 5 , 6 , 7 , 8 , 1 , 9 , 3};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int min = arr[0];
		for(int i = 1 ; i <= arr.length - 1 ; i++) {
			if (arr[i]< min) {
				min = arr[i];
				}
			}
		
	    System.out.println();
		System.out.println("the Smallest number is "+ min);
		

	}

}
