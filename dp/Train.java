package dp;

public class Train {
	
	public static int path(int[][] arr , int m , int n) {
		int dp[][] = new int[m + 2][n + 1];
		for(int j = 1 ; j <= n ; j++) {
			for(int i = m ; i > 0 ; i--) {
				dp[i][j] = arr[i-1][j-1] + Math.max(dp[i+1][j] , dp[i][j-1]);
			}
		}
		if(dp[1][n] < 0) {
			return Math.abs(dp[1][n]);
		}
		
		return 0;
	}

}
