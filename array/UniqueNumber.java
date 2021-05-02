package array;

public class UniqueNumber {
	
	public static int uniqueNumber(int arr[] ) {
		int r = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			r = r^arr[i];	
		}
		return r;
//		System.out.println(r);  // void return;
	}

	public static void main(String[] args) {
		int array[] = { 1 , 3 , 5 , 1 , 5 };
		
		System.out.println(uniqueNumber(array));

	}

}
