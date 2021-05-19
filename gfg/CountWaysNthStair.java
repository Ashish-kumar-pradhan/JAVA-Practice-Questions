package gfg;

public class CountWaysNthStair {
	
	public static long nthStair(int n)
    {
        // Code here
        long storage[] = new long[n];
		for(int i = 0 ; i < n ; i++) {
			if(i < 2) storage[i] = 1; 
 			else storage[i] =  storage[i-1] +  storage[i-2]; 
		}
		return storage[n-1];	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthStair(4));

	}

}
