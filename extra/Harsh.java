package extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Harsh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		while(sc.hasNext()) {
			arr.add(sc.next());
		}
		
		if(arr.size() == 0) {
			System.out.println("NA");
		}
		
		HashMap<String , Integer> hp = new HashMap<String , Integer>();
		int n = arr.size();
		for(int i = 0 ; i < n ; i++) {
			if(hp.containsKey(arr.get(i))) {
				hp.put(arr.get(i), 2);
			}
			else {
				hp.put(arr.get(i), 1);
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(hp.get(arr.get(i)) > 1) {
				System.out.print(arr.get(i) + " ");
				hp.put(arr.get(i), 0);
			}
		}

	}

}
