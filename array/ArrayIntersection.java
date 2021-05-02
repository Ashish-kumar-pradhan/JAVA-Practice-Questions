package array;

public class ArrayIntersection {
	
	public static void intersection(int arr1[] , int arr2[]) {
		int temp = 0;
		int count = 0;
		for (int i = 0 ; i < arr1.length ; i++) {
			for (int j = 0 ; j < arr2.length ; j++) {
				if(arr1[i]==arr2[j]) {
					temp = arr1[i];
					arr2[j]=0;
					count = count + 1;
					System.out.print(temp + " ");
					break;
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {1 , 4 , 5 , 3 , 2 , 5 , 9 };
		int a2[] = {1 , 4 , 7 , 3 , 2 , 3 , 6 };
		
		intersection(a1 , a2);
	}

}
