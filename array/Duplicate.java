package array;

public class Duplicate {
	
	public static void duplicate(int arr[] ) {
		int same = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					same = arr[i];
					break;
					
				}
			}
		}
		System.out.println(same);
		
	}

	public static void main(String[] args) {
		int array[] = {1 , 4 , 5 , 7 , 3 , 2 , 8 , 4 , 6};
		duplicate(array);

	}

}
