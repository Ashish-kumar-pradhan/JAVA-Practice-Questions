package infosys;

public class PQ1 {
	
	public static int value(String S) {
		int n = S.length();
		int m = 1;
		int ans = 0;
		for(int i = n-1 ; i >= 0 ; i-- ) {
			if(S.charAt(i) == '1') {
				ans = (ans + m)%1000000007;
			}
			
			m = (m*2)%1000000007;
		}
		
		return ans;
	}
	
	public static int sumBinary(int N , int K , String S) {
		int l = N - K + 1;
		int sum = 0; 
		for(int i = 0 ; i < l ; i++) {
			sum = (sum | value(S.substring(i, K+i)))%1000000007;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println(sumBinary(5 , 4 , "11111"));
	}

}
