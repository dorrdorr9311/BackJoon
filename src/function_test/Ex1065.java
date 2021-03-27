package function_test;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		
		if(n<100)
			System.out.print(n);
		else if(100<= n && n<1000) {
			int hunDigit = n % 100;
			int d1 = (0 - hunDigit)/2;
			
		}
			
			
		
		
	}
	
	
}
