package greedyAlgorithm;

import java.util.Scanner;

public class Ex11399 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i < n;i++) {
			arr[i] = scan.nextInt();  
		}
		int partialsum = 0;
		int sum=0;
		
		for(int j=0; j<n; j++) {
		
		
			int min = arr[j];
		
			int minIndex=j;
		
		for(int i =j; i<n; i++) {
			if( min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
			int tem = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = tem;
	
			partialsum += arr[j];
			sum += partialsum; 		
		}
		System.out.println(sum);
			
	}
	
}


