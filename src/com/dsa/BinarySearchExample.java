package com.dsa;

public class BinarySearchExample {
    public static void main(String[] args) {
//    	int[] nums= {1,2,3,5,7,9,11,13,15,22,24,25,29,30,32};
    	int[] nums=new int[32]; //binary will take just 1+ steps but linear take double
    	int target=900;
    	int left=0;
		int right=nums.length-1;
    	int Result1=searchBinary(nums,target,left,right);
    	int Result2=LinearSearch(nums,target);
    	
//    	if(Result != -1)
//    	System.out.println("elements are found at " + Result + " index");
//    	else
//    		System.out.println("not found");
	}
       

	private static int searchBinary(int[] nums, int target,int left,int right) {
		//by achieve through recurrsion(call the function repeatively by changing value
		int steps=0;
		if(left <= right) {
		steps++; //everytime it iterate take each steps
		int mid=(left + right ) /2 ;
		if(nums[mid] == target) {
				System.out.println("steps taken by binary :" + steps);
			return mid;
		}
			else if(nums[mid] < target)
				searchBinary(nums, target, left=mid+1, right);
		else 
			searchBinary(nums, target, left, right=mid-1);
	}
		System.out.println("steps taken by binary :" + steps);
		return -1;
		
		
		
	
//		while(left <= right) {
//			steps++; //everytime it iterate take each steps
//			int mid=(left + right ) /2 ;
//			if(nums[mid] == target) {
//				System.out.println("steps taken by binary :" + steps);
//				return mid;
//			}
//			else if(nums[mid] < target)
//				left=mid+1;
//			else 
//				right=mid-1;
//		}
//		System.out.println("steps taken by binary :" + steps);
//		return -1;
	}
public static int LinearSearch(int nums[],int taregt) {
		int steps=0;
		for(int i=0;i<nums.length;i++) {
			steps++;  //everytime it iterate take each steps
			if(nums[i] == taregt) {
				System.out.println("steps taken by linear :" + steps);
				return i;
			}
		}
		System.out.println("steps taken by linear :" + steps);
		return -1;
}
}