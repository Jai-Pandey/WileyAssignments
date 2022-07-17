package com.jai.ll;


public class Reverse {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void sortedInsert(int data) {
		Node current;
		Node new_node = new Node(data);
		
		if (head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		}
		else {
			current = head;
			while (current.next != null && current.next.data < new_node.data)
				current = current.next;
				new_node.next = current.next;
				current.next = new_node;
		}
	}
	
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	void printReverse(Node head) {
		if(head == null) {
			return;
		}
		printReverse(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String args[]) {
		
		Reverse llist = new Reverse();
		llist.sortedInsert(5);
		llist.sortedInsert(10);
		llist.sortedInsert(7);
		llist.sortedInsert(3);
		llist.sortedInsert(1);
		llist.sortedInsert(9);
		
		System.out.println("Created Linked List");
		llist.printList();
		
		System.out.println("\nReverse Order is: ");
		llist.printReverse(llist.head);
	}
}
