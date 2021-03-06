package com.jai.circular;

public class CircularLinkedList<T> {
		
	 public class Node{  
	        T data;  
	        Node next;  
	        public Node(T data) {  
	            this.data = data;  
	        }  
	    }  
	    public Node head = null;  
	    public Node tail = null;  
	    
	    public void insertElement(T data){  
	    	
	        Node newNode = new Node(data);  
	       
	        if(head == null) {  
	            
	            head = newNode;  
	            tail = newNode;  
	            newNode.next = head;  
	        }  
	        else {  
	            tail.next = newNode;  
	            tail = newNode;  
	            tail.next = head;  
	        }  
	    }  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            System.out.println("Nodes of the circular linked list: ");  
	             do{  
	                System.out.print(" "+ current.data);  
	                current = current.next;  
	            }while(current != head);  
	            System.out.println();  
	        }  
	    }
	}
