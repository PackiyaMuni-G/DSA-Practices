package com.dsa;

public class Stack {
	
	int[] arr=new int[5];
	int top;
	
	public Stack() {
		int size=arr.length;
		int top=-1;
	}

	public void push(int data) {
	
	  arr[top]=data;
	  top++;
	}
  public void printStack() {
	  for(int n:arr) {
		  System.out.print(n + " ");
	  }
	  System.out.println();
  }
}
