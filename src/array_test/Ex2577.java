package array_test;

import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = a*b*c;
	
		int m =  (Integer.toString(n)).length();
		
		int[] count = new int[10];
		int[] arr = new int[m];
		
		for(int i =0; i<m; i++){
			arr[m-i-1] = n % 10 ;
			n = n/10;
		}
		
		for(int i = 0; i < m; i++) {
			switch(arr[i]) {
				case 0:
					count[0]++;
					break;
				case 1:
					count[1]++;
					break;
				case 2:
					count[2]++;
					break;
				case 3:
					count[3]++;
					break;
				case 4:
					count[4]++;
					break;
				case 5:
					count[5]++;
					break;
				case 6:
					count[6]++;
					break;
				case 7:
					count[7]++;
					break;
				case 8:
					count[8]++;
					break;	
				case 9:
					count[9]++;
					break;
				default:
					break;
			}
			
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
			
		
		
	}

}
