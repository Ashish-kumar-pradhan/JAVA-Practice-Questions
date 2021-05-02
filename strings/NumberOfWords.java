package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
		String str;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  ");
		
		str = sc.nextLine();
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == ' ')
				count++;
		}
		System.out.println("Number of words " + (count+1));
	}

}
