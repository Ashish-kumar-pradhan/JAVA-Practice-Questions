package sorting;

public class SsTry1 {

	public static void main(String[] args) {
		  int[] arr = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;
	            
	            System.out.println();
	            
	            for(int k:arr){  
		            System.out.print(k+" ");
		        }
	            System.out.println();
	            
	        } 
	        System.out.println();
	        System.out.println("After Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");
	        }
	}

}
