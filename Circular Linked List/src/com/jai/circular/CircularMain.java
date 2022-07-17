package com.jai.circular;

import java.util.Scanner;

public class CircularMain {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
		CircularLinkedList<Integer> linkedList=new CircularLinkedList<Integer>();
		int ch=1;
		while(ch!=0) {
			System.out.println("Enter element : ");
			linkedList.insertElement(scanner.nextInt());
			System.out.println("Do you want to add more elements press 0 for no and 1 for yes: ");
			ch=scanner.nextInt();
		}
		
		System.out.println("Enter element : ");
		
		
		linkedList.display();
		

	}

	}


