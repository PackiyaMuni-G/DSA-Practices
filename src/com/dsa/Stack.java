package com.dsa;

public class Stack {
	
	int[] arr=new int[5];
	int size;
	int top;
	
	public Stack() {
		 size=arr.length;
		int top=-1;
	}

	public void push(int data) {
	 if(top > -1) {
		  arr[top]=data;
		  top++;
	 }
	 else {
		 System.out.println("Stack is empty");
	 }

	}
  public void printStack() {
	  for(int n:arr) {
		  System.out.print(n + " ");
	  }
	  System.out.println();
  }

public int pop() {
        //remove & return an element
	return arr[top--];
}

public int peek() {
     //only remove last element
	return arr[top];
}
}
