package loops;

public class NumberPattern1 {

	public static void main(String[] args) {
	
	
		for (int i = 1 ; i <= 4 ; i++) {
			for (int j = 1 ; j <= 4 ; j++) {
				int k = j+i-1;
				if(k<=4) {
				System.out.print(k+" ");
				} else {
					System.out.print(k-4+" ");
				}
			}
			System.out.println();
		}

	}

}
