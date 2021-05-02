package array;

public class Sort012 {
	
	public static void sort012(int arr[]) {
		int zero = 0;
		int one = 0 ;
		int two = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i]==0) {
				zero++;
			}else if (arr[i] == 1) {
				one++;
			}else if (arr[i]==2) {
				two++;
			}
			
		}
//		System.out.println(zero);
//		System.out.println(one);
//		System.out.println(two);
		
		for(int i = 0 ; i < zero ; i++) {
			arr[i]=0;
		}
		for(int i = zero ; i < zero + one ; i++) {
			arr[i]=1;
		}
		for(int i = zero + one ; i < zero + one + two ; i++) {
			arr[i]=2;
		}
		
		for(int i = 0 ; i < zero + one + two; i++ ) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1 , 0 , 0 , 2 , 1 , 2 , 0 , 1 , 2 , 1 };
		sort012(array);
		

	}

}
