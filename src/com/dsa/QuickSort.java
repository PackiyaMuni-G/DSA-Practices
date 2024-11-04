package com.dsa;

public class QuickSort {
	
	 //Pick a pivot & place it correct position=>central point 
	//Recursive =>calling itself again & again
	//Partition Function =>it return a pivot var

	public static void main(String[] args) {
	 int[] nums= {5,6,2,3,1,8,4};
	 int temp;
	  int low=0;
	  int high=nums.length-1;
	
	 quickSort(nums,low,high);
	 for (int i : nums) {
		System.out.print(i  + " ");
	}
      
	}

	private static void quickSort(int[] nums, int low, int high) {
		if(low < high) {
		 int pivotIndex=partition(nums,low,high); //it return a pivot var ,Get pivot index after partition
		 quickSort(nums, low,pivotIndex-1); // Recursively sort elements before pivot
		 quickSort(nums, pivotIndex+1, high); // Recursively sort elements after pivot
		}
	}

	private static int partition(int[] nums, int low, int high) {
		int temp;
		int pivot=nums[high]; //Take the pivot as the last element.so here its 4 & it should be correct postion after end of first loop
	     int i=low-1;  
		for (int j = low; j < high; j++) {
		 if(nums[j] < pivot) { // Compare with pivot value, not pivot index
			 i++;
			 // Swap nums[i] and nums[j]	
			  temp=nums[i];
			     nums[i] = nums[j];
			      nums[j]=temp;
		 }
		 
		 
	}
		 //pivot should be correct postion after end of first loop,so here perform some swap logic
        temp=nums[i+1];
              nums[i+1]=nums[high];
             nums[high] =temp;
	return i+1; // Return the index of the pivot element after partition
    }
	}

	

