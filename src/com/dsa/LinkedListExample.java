package com.dsa;



public class LinkedListExample {
	//Node

	public static void main(String[] args) {
		
		LinkedList<Integer> nums=new LinkedList<>();
		nums.add(5);
		nums.add(9);
//		nums.addFirst(6);
//		System.out.println(nums);
		nums.printValue();
//		System.out.println(nums.peek());
//		System.out.println(nums.get(2)); //1st=>head,1st ,2nd => 9
	}

}
