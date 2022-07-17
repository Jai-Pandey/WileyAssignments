package com.jai.linkedlsit;

public class LinkedList {
		
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	public void insertElement(int data) {
		Node newNode=new Node(data);
		
		//if list is blank
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public void deleteElement(int data) {
		if(head!=null)
		{
		Node last=head;
		while(last.next!=null&&last.next.data!=data) {
			last=last.next;
		}
		if(last.next!=null)
		last.next=last.next.next;
		
		}
		
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
