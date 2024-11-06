package com.dsa;

class Node{
	//Every node has data and reference(next) of memory address to next node
	int data;
	Node next;
	
	public Node(int data) {
		//by default new node next is null
		this.data=data;
		next=null;
	}
}


public class MyLinkedList {
	Node head=null;
 
	public void add(int data) {
		//Everytime u add element,basically u create new node
               Node newNode=new Node(data);
                     newNode.data=data;
                     Node current=head;
                     //it only execute when u add first element into Linkedlist,after that it s not null
                     if(head == null) {
                 		head=newNode;
                     }
                     else {
                    	// traverse the list until current is null
                    	 while(current.next !=null) {
                    		 //current next refers to next node by memory address
                    		 current= current.next;
                    		
                    	 }
                    	 current.next=newNode;
                    	    
                     }

	}

	public void printValue() {
		Node current=head;
	//	traverse current and print its data and move to next node until it null
		while(current !=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}

	public void addFirst(int data) {
	    Node newNode=new Node(data);
	    newNode.next=head;
	    head=newNode;
	    
		
	}

	public void delete(int data) {
		Node current =head; ///2 5 9 6
		while (current.next !=null && current.next.data!=data) {
			          current=current.next;
		}
		if(current.next != null) {
			current.next= current.next.next;
		}
		
		
	}
}
