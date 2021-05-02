package array;

public class SecondGreatestNumber {

	public static void main(String[] args) {
		
		int arr[] = { 5 , 6 , 9 , 7 , 1 , 9 , 8};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int great = arr[0];
		int secondGreat = 0;
		for(int i = 1 ; i <= arr.length - 1 ; i++) {
			if (arr[i]>great) {
				secondGreat = great;
				great = arr[i];
			} else if(arr[i]!=great) {
				if (arr[i]>secondGreat) {
					secondGreat = arr[i];
				}
			}
			System.out.println(secondGreat+"  " + great);
			
		}
		 System.out.println();
		 System.out.println("the second Greatest number is "+ secondGreat);
		

	}

}
