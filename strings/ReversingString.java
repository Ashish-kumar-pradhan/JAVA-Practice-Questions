package strings;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  ");
		str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		int y = str.length() - 1;
		for(int i = 0; i< str.length()/2; i++) {
			char temp = arr[i];
			arr[i] = arr[y];
			arr[y] = temp;
			y--;
		}
		str = new String(arr);
		sc.close();
		System.out.println("Reversed string is "+str);

	}

}
