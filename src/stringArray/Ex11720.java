package stringArray;

import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		String m = scan.next();
		int sum = 0;
		
		for(int i = 0; i < n; i++){
			arr[i] = m.charAt(i)-48;
			sum += arr[i];
		}
		System.out.println(sum);
	}
}

