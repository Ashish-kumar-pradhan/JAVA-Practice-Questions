package array;

public class ThirdGreatestNumber {

	public static void main(String[] args) {

		int arr[] = { 5 , 6 , 8 , 3 , 1 , 9 , 8 , 7 , 9};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int great = arr[0];
		int secondGreat = 0;
		int thirdGreat = 0;
		for(int i = 1 ; i <= arr.length - 1 ; i++) {
			if (arr[i]>great) {
				thirdGreat = secondGreat;
				secondGreat = great;
				great = arr[i];
				
			} else if (arr[i] != great){
				if (arr[i] > secondGreat){
					thirdGreat = secondGreat;
					secondGreat = arr[i];
			
				} else if(arr[i] != secondGreat){
					if(arr[i]>thirdGreat) {
						thirdGreat = arr[i];
						}
				
				}
			}
			System.out.println(thirdGreat +"  "+ secondGreat+"  " + great);
		}
		
		 System.out.println();
		 System.out.println("the Third Greatest number is "+ thirdGreat);
		
	}

}
