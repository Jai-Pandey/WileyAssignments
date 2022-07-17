package com.jai.reverse;

public class ReverseOrder<T> {
		
	class Node{
		T data;
		Node next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	public void insertElement(T data) {
		Node newNode=new Node(data);
		
	
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
	
	public Node reverse() {
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		head=prev;
		return head;
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
