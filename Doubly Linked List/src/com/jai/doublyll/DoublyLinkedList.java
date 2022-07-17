package com.jai.doublyll;

public class DoublyLinkedList<T> {  
  
    class Node{  
        T data;  
        Node previous;  
        Node next;  
  
        public Node(T data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;  
   
    public void addNode(T data) {  
       
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }
}