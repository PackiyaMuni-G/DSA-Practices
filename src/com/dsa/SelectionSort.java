package com.dsa;

public class SelectionSort {

	public static void main(String[] args) {
		int minIndex;
		int temp;
		int[] nums= {6,5,2,8,9,4};
		System.out.println("before sorting");
		 for(int n: nums) {
			 
	    	 System.out.print(n + " ");
	     }
		// first we fount out minIndex by comparing elements
		for (int i = 0; i < nums.length-1; i++) {
		              minIndex=i;   //minIndex = 0 becoz i is set to minIndex
			for (int j = i+1; j < nums.length; j++) {
				if(nums[minIndex] > nums[j]) {   
					 minIndex=j; // Update minIndex if a smaller element is found Since 6 > 5, we update minIndex = 1.
				}
				  
			}
			//After completing 1st the inner loop, minIndex is 2, which means nums[2] = 2
			// Swap the found minimum element with the first unsorted element
		     temp=nums[minIndex];    //temp = nums[2] = 2
		        nums[minIndex]=nums[i];  // nums[2] = nums[0] = 6
		         nums[i]=temp;             // nums[0] = 2
//		     	System.out.println();
//		    	  for(int n: nums) {
//		    		//u will get minIndex after finished 1st Innerloop iteration
//		  			//2 5 6 8 9 4 
//				    	 System.out.print(n + " ");
//				     }
			
		}
		System.out.println("\nafter sorting");
		 for(int n: nums) {
			 
	    	 System.out.print(n + " ");
	     }
		

	}

}
