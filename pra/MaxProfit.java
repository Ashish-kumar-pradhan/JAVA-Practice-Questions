package pra;

public class MaxProfit {
	
	public static int MaxProfit(int arr[]) {
		int n = arr.length;
		int max = arr[0];
		int min = arr[0];
		int maxI = 0;
		int minI = 0;
		int dif = 0;
		for(int i = 1 ; i < n ; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxI = i;
			}
			
			if(min > arr[i] )
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
