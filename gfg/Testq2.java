package gfg;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Testq2 {
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int a[]=new int[N];
		    for(int i=0 ; i < N ; i++){
		        a[i] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    
		    for(int i=0 ; i < N-2 ; i++) {
		        System.out.print(a[i]+" ");
		    }
		}
	}
}

