package array;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int arr[] = { 5 , 6 , 7 , 8 , 1 , 9 , 3};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int great = arr[0];
		for(int i = 1 ; i <= arr.length - 1 ; i++) {
			if (arr[i]>great) {
				great = arr[i];
				}
//			System.out.println(great+"  "+arr[i]);
			}
		
	    System.out.println();
		System.out.println("the Greatest number is "+great);
	}
}
