package stringArray;

import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int m = str.length();
		int[] alphabet = new int[26];
		for(int i =0; i<26; i++) {
			alphabet[i]= -1;
		}
		
		for(int i=0; i < m;i++) {
			int index = str.charAt(m-i-1)-97;
			alphabet[index] = m-i-1;
		}
		for(int i =0; i<26; i++) {
			System.out.printf(alphabet[i]+" ");;
		}
		
	}
}
