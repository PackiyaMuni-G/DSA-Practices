package com.dsa;

public class MergeSortExample {
    // Merge Sort uses a divide & conquer approach to sort arrays.
    // It recursively splits the array into halves, sorts each half, and then merges them back together.
    // Time complexity is O(n log n) in the worst case.

    // Main mergeSort function to split and sort array sections
    private static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            // Calculate middle point to split array section
            int mid = (l + r) / 2;

            // Recursively sort the left half of the current section
              mergeSort(nums, l, mid);

            // Recursively sort the right half of the current section
            mergeSort(nums, mid + 1, r);

            // Merge sorted halves together
            merge(nums, l, mid, r);
        }
    }

    // Merge function to combine two sorted halves into one sorted section
    private static void merge(int[] nums, int l, int mid, int r) {
        // Determine sizes of the two halves to be merged
    	//nums = {8, 57, 9, 111, 6, 7, 95}
    	//n1 = mid - l + 1 = 3 - 0 + 1 = 4, so lArr will be of size 4.
        int n1 = mid - l + 1; // Left sub-array size
        int n2 = r - mid;     // Right sub-array size 

        // Temporary arrays to hold the left and right sub-arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy elements into left sub-array
        // if l = 0 and x = 0, the line copies nums[0] into lArr[0]. In the next iteration, it will copy nums[1] into lArr[1]
        for (int x = 0; x < n1; x++) {
            lArr[x] = nums[l + x];
        }

        // Copy elements into right sub-array
        for (int x = 0; x < n2; x++) {
            rArr[x] = nums[mid + 1 + x];
        }

        // Initial indices for left sub-array (i), right sub-array (j), and merged array (k)
        int i = 0, j = 0, k = l;

        // Merge the two halves by comparing elements from left and right sub-arrays
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                nums[k] = lArr[i];  // Copy from left sub-array if it has the smaller element
                i++;                // Move to next element in left sub-array
            } else {
                nums[k] = rArr[j];  // Copy from right sub-array if it has the smaller element
                j++;                // Move to next element in right sub-array
            }
            ////so after end of a every whileloop ,u will get 1st value of the main arr and it move into next index until condition met
            k++;  // Move to next position in the merged array
        }

        // Copy any remaining elements from the left sub-array, if any
        while (i < n1) {
            nums[k] = lArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right sub-array, if any
        while (j < n2) {
            nums[k] = rArr[j];
            j++;
            k++;
        }
    }

    // Main function to test the Merge Sort implementation
    public static void main(String[] args) {
        int[] nums = {8, 57, 9, 111, 6, 7, 95};

        // Print array before sorting
        System.out.println("Before sorting:");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        // Call mergeSort on the entire array
        mergeSort(nums, 0, nums.length - 1);

        // Print array after sorting
        System.out.println("\nAfter sorting:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
