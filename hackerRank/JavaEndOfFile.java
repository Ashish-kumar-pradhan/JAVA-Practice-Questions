package hackerRank;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        String a[] = new String[t];
        
        for(int i = 0 ; i < t ; i++) {

        	while(sc.hasNext() == true){
        	       a[i]=sc.nextLine();
        	   }
        	
        }
        
        for(int i = 0 ; i < t ; i++){
        	
        	System.out.println(a[i]);
        	break;
        }
	}

}
