package com.dsa;

public class LinearSearchDemo {

	public static void main(String[] args) {
	int[] nums= {3,5,7,9,11};
	int target=9;
	
	int Result=LinearSearch(nums,target);
	if(Result != -1) {
		System.out.println("target element at index :"+ Result);
	}
	else {
		System.out.println("no element is found");
	}

	}

	public static int LinearSearch(int nums[],int taregt) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == taregt) {
				return i;
			}
		}
		return -1;
	}

}
