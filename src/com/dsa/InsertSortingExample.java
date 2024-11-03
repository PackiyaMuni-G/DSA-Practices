package com.dsa;


public class InsertSortingExample {

	public static void main(String[] args) {
		int[] nums= {5,9,6,2,3,10,1,8,4};
		int key;
		for (int i = 1; i < nums.length; i++) {
			key=nums[i]; 
			 int j=i-1;
			 while ( j >= 0 && nums[j] > key ) {  //1st => //6>2   2nd=>5>2
				 nums[j+1]=nums[j];               //      => 6 will move to next postion   2nd=> 5will move next
				         j--;                             // => j will decrease -1(1st index) postion  2nd=>j will move -1
			}
			   nums[j+1]=key;
		}
		
		 for (int i : nums) {
			 System.out.print(i + " ");
		}
        
	}

}
