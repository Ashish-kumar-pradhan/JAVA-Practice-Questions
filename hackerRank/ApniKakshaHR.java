package hackerRank;

public class ApniKakshaHR {

	public static void main(String[] args) {
		
		int arr[] = {5, 4, 1, 8, 9, 9, 9, 1, 2};
		
		int newArr[] = new int[arr.length];
		for(int i=0 ; i < arr.length ; i++) {
			newArr[i]=1;
		}
		for (int i=0; i<arr.length-1;i++) {
			if (arr[i]<arr[i+1]) {
				newArr[i+1] = newArr[i] + 1;
			}
		}
		for (int i=arr.length-1; i > 0 ; i--) {
			if(arr[i-1]>arr[i]) { 
				if (newArr[i-1]<=newArr[i]){
					newArr[i-1] = newArr[i] + 1;
					}
				}
			}
		int sum = 0;
		for(int i : newArr) {
			sum += i;
		
		}
		System.out.println("the no. of candies is "+sum);

	}

}
