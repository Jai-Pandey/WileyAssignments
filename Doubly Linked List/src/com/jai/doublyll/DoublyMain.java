package com.jai.doublyll;
import java.util.*;

public class DoublyMain {

		public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
			
			DoublyLinkedList<Integer> linkedList=new DoublyLinkedList<Integer>();
			int ch=1;
			while(ch!=0) {
				System.out.println("Enter element : ");
				linkedList.addNode(scanner.nextInt());
				System.out.println("Do you want to add more elements press 0 for no and 1 for yes: ");
				ch=scanner.nextInt();
			}
			
			System.out.println("Enter element : ");
			
			
			linkedList.display();
			

		}

	}

