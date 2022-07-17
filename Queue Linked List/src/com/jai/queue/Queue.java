package com.jai.queue;

public class Queue<T> {

		Node front,rear;
		int size;
		
		class Node{
			T data;
			Node next;
			public Node(T data) {
				super();
				this.data = data;
				this.next = null;
			}
		}
		
		public boolean isEmpty() {
			return (size==0);
		}
		
		public T dequeue() {
			T data=front.data;
			front=front.next;
			if(isEmpty()) {
				rear=null;
			}
			size--;
			System.out.println(data);
			return data;
		}
		
		public void enqueue(T data) {
			Node temp=rear;
			rear=new Node(data);
			rear.next=null;
			
			if(isEmpty()) {
				front=rear;
			}
			else {
				temp.next=rear;
			}
			size++;
			System.out.println(data);
			
		}
		
		public void display() {
			Node currentNode=front;
			while(currentNode!=null) {
				System.out.println(currentNode.data);
				currentNode=currentNode.next;
			}
		}
}