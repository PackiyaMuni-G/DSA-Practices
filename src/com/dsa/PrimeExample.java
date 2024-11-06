package com.dsa;

public class PrimeExample {
	private static boolean isPrime(int n) {

		while(n <=1) {
			return false;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n % i== 0) {
				return false;
			}
			
			
		}
		return true ;
		
	}
 public static void main(String[] args) {
	 int limit=17;
	 for (int n = 2; n <= limit; n++) {
			if (isPrime(n)) {
				System.out.println(n);
			}
	}

}


}
