package array;

public class RotatingArray {
	
	public static void rightByOne(int arr[]) {
		int arr2[] = new int[arr.length];
		arr2[0] = arr[arr.length-1];
		for(int i = 0 ; i < arr.length-1 ; i++) {
			arr2[i+1] = arr[i];
		}
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
	public static void leftByOne(int arr[]) {
		int arr2[] = new int[arr.length];
		arr2[arr.length-1] = arr[0] ;
		for (int i = 1 ; i < arr.length ; i++) {
			arr2[i-1] = arr[i];
		}
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
	public static void rightByN(int arr[] , int n) {
		int arr2[] = new int[arr.length];
		for(int i = 0 ; i < arr.length - n ; i++) {
			arr2[i+n] = arr[i];
		}
		for(int i = 0 ; i < n ; i++) {
			arr2[i] = arr[i + arr.length - n];
		}
			
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
	public static void leftByN(int arr[] , int n) {
		int arr2[] = new int[arr.length];
		for(int i = 0 ; i < arr.length -n ; i++) {
			arr2[i] = arr[i + n];
		}
		for(int i = 0 ; i < n ; i++) {
			arr2[i + arr.length - n] = arr[i];
		}
			
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[] = {1 , 2, 3, 4, 5, 6};
		rightByOne(arr);
		leftByOne(arr);
		rightByN(arr , 2);
		leftByN(arr , 2);
	}

}
