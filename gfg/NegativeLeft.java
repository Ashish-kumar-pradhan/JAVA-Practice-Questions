package gfg;

public class NegativeLeft {
	
	public static int[] set(int arr[]) {
		int arr2[] = new int[arr.length];
		int j = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] < 0 ) {
				arr2[j]=arr[i];
				j++;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] >= 0 ) {
				arr2[j] = arr[i];
				j++;
			}
		}
		return arr2;
	}
	
	public static void print(int arr[]) {
	
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 , -1 , - 5 , - 7 , 8 , 9 , -6 , 10};
		arr = set(arr);
		print (arr);
		

	}

}
