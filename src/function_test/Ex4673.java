package function_test;

public class Ex4673 {

	public static void main(String[] args) {
		
		
		int[] self = new int[10035];
				
				for(int i=1; i<=10000; i++) {
					int g = generate(i);
					self[g-1] = 1;
				}
				
				for(int i=0; i<10000; i++) {
					if(self[i]==0)
						System.out.println(i+1);
				}
				
	}	
	
	public static int generate(int m){	
		int sum = 0;
		int tem = 0;
		int num = m;
		
		do {
			tem = m % 10;
			sum += tem;
			m = m /10;
		}while(m!=0);
			
		return num + sum;
	}

}
