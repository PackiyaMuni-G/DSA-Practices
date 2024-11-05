package com.dsa;

class Node{
	//Every node has data and reference of memory address to next node
	int data;
	Node next;
	
	public Node(int data) {
		//by default new node next is null
		this.data=data;
		next=null;
	}
}


public class LinkedList<Integer> {
	Node head=null;
 
	public void add(int data) {
		//Everytime u add element,basically u create new node
               Node newNode=new Node(data);
                     newNode.data=data;
                     Node current=head;
                     //it only execute when u add first element into Linkedlist,after that it s not null
                     if(head == null) {
                 		newNode=head;
                     }
                     else {
                    	// traverse
                    	 while(current.next !=null) {
                    		 //current next refers to next node by memory address
                    		 current= current.next;
                    		 current.next=newNode;
                    	 }
                    	 
                    	    
                     }

	}

	public void printValue() {
		Node current=head;
	//	move to next current and print its data and move to next node until it null
		while(current !=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
}
