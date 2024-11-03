package com.dsa;

public class BubbleSortExample {

	public static void main(String[] args) {
	int[] nums= {6,5,2,8,9,4};
	int temp=0;
	System.out.println("before sorting");
	 for(int n: nums) {
		 
    	 System.out.print(n + " ");
     }
    for(int i=0;i<nums.length;i++) {
    	for (int j = 0; j < nums.length-i-1; j++) { //this loop is responsible for swapping elements
			if(nums[j] > nums[j+1]) {        // {5,2,6,8,4,9}
				
			temp=nums [j];              
				    nums[j]=nums[j+1];
				    nums[j+1]=temp;
				  
			}
			
		   
		}
    	System.out.println();
    	  for(int n: nums) {
		    	
		    	 System.out.print(n + " ");
		     }
    }
    System.out.println();
    System.out.println("after sorting");
     for(int n: nums) {
    	
    	 System.out.print(n + " ");
     }

	}
}
