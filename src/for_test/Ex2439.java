package for_test;

import java.util.Scanner;

public class Ex2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i =1 ; i<=n; i++) {
			for(int k=1; k<=n-i; k++)
				System.out.printf(" ");
			for(int j=1; j<=i; j++)
				System.out.printf("*");
		
			System.out.println();
		}
	}

}
