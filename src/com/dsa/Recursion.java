package com.dsa;

public class Recursion {
	
	public static void main(String[] args) {
	System.out.println(factorail(5));

	}

	private static int factorail(int n) {
	
		
		if (n == 0) {
			
			  
			return 1;
		}
		return n * factorail(n-1);
	
		
		
		
			
		
		
	}

}
