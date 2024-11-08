package com.dsa;



public class StackExample {

	public static void main(String[] args) {
	Stack nums=new Stack();
	nums.push(10);
	nums.push(15);
	System.out.println(nums.peek());
	nums.push(20);
	nums.push(25);
	
//	System.out.println(nums);
//     System.out.println(nums.pop()); 

    nums.printStack();
 
  
	}

}
