import java.util.Scanner;

public class TotalSalary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalSum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		double n = sc.nextDouble();
		char c = sc.next().charAt(0);
		totalSum = n*1.59;
		
		if(c == 'A') {
			totalSum += 1700;
		}
		else if(c == 'B') {
			totalSum += 1500;
		}
		else{
			totalSum += 1300;
		}
		
		System.out.println((int)totalSum);

//		double a = 1.0*6/4;  
//		int b = 6/4;
//		double c = a + b ;
//		System.out.println(a + " + " + b + " = " + c);
	}

}
