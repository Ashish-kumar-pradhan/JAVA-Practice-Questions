package tcs;

import java.util.*;

class Flowers{
	int fID;
	String fN;
	int p;
	int r;
	String t;
}

public class MyClass5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Flowers> arr = new ArrayList<>();
		while(sc.hasNextInt()) {
			Flowers f = new Flowers();
			f.fID = sc.nextInt();
			f.fN = sc.nextLine();
			f.p = sc.nextInt();
			f.r = sc.nextInt();
			f.t = sc.nextLine();
			
			arr.add(f);
		}
		
		String c = sc.nextLine();
		
		int ans = findMinPriceByType(arr , c);
		
		if(ans == -1) {
			System.out.println("There is no flower with given type");
		}
		else {
			System.out.println(ans);
		}

	}

	private static int findMinPriceByType(ArrayList<Flowers> arr, String c) {
		
		int n = arr.size();
		int min = Integer.MAX_VALUE;
		int ans = -1;
		for(int i = 0 ; i < n ; i++) {
			String type = arr.get(i).t;
			int rat = arr.get(i).r;
			int price = arr.get(i).p;
			int id = arr.get(i).fID;
			if(type.equals(c) && rat > 3) {
				if(min > price) {
					min = price;
					ans = id;
				}
			}
		}
		
		return ans;
		
	}

}
