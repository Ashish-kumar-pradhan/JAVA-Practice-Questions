package pra;

public class D2 {
	
	
	private static int maximunProfit(int prices[], int n) {
		
		int start = 0;
		int end = n-1;
		
		return maxProfit(prices, start, end);
		
	}
	private static int maxProfit(int prices[], int start, int end)
	{
	  
	    if (end <= start)
	        return 0;
	  
	    int profit = 0;
	  
	    for (int i = start; i < end; i++) 
	    {
	  
	        for (int j = i + 1; j <= end; j++)
	        {
	  
	            if (prices[j] > prices[i]) 
	            {
	  
	                int curr_profit = prices[j] - prices[i] + maxProfit(prices, start, i - 1)  + maxProfit(prices, j + 1, end);
	  
	                profit = Math.max(profit, curr_profit);
	            }
	        }
	    }
	    return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
