package pra;

public class D1 {
	
	private static String getSequence(String arr)
	    {
	       
	        int curr_max = 0;
	 
	        int last_entry = 0;
	 
	        int j;
	 
	        String ans = "";
	        
	        for (int i = 0; i < arr.length(); i++)
	        {
	           
	            int noOfNextD = 0;
	 
	            switch (arr.charAt(i))
	            {
	                case 'I':
	                	 j = i + 1;
	                    while (j < arr.length() && arr.charAt(j) == 'D')
	                    {
	                        noOfNextD++;
	                        j++;
	                    }
	 
	                    if (i == 0)
	                    {
	                        curr_max = noOfNextD + 2;
	                        
	                        last_entry++;
	                        ans = ans + last_entry + curr_max; 
	 
	                       
	                        last_entry = curr_max;
	                    }
	                    else
	                    {
	                        
	                        curr_max = curr_max + noOfNextD + 1;
	 
	                        
	                        last_entry = curr_max;
	                        
	                        ans += last_entry;
	                      
	                    }
	 
	                    
	                    for (int k = 0; k < noOfNextD; k++)
	                    {
	                    	last_entry--;
	                    	ans += last_entry;
	                        
	                        i++;
	                    }
	                    break;
	 
	               
	                case 'D':
	                    if (i == 0)
	                    {
	                    	 j = i + 1;
	                        while (j < arr.length()&&arr.charAt(j) == 'D')
	                        {
	                            noOfNextD++;
	                            j++;
	                        }
	 
	                        curr_max = noOfNextD + 2;
	 
	                        ans = ans + curr_max + (curr_max - 1);
	                       
	 
	                       
	                        last_entry = curr_max - 1;
	                    }
	                    else
	                    {
	                        ans = ans + (last_entry - 1);
	                        
	                        last_entry--;
	                    }
	                    break;
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getSequence("IDIDI"));

	}

}
