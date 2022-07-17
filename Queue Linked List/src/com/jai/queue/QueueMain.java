package com.jai.queue;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Queue<Integer> queue=new Queue<Integer>();
		int ch;
		do {
			System.out.println("1. Enqueue \n2. Dequeue \n3.Show Queue : \n0. Exit");
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.print("Enter element : ");
					queue.enqueue(sc.nextInt());
					break;
			
			case 2: Integer value=queue.dequeue();
					if(value!=null) {
					System.out.println("Deleted element = " + value);}
					else {
						System.out.println("Queue is Empty");
					}
					break;
			
			case 3: queue.display();
					break;
			case 0: System.exit(0);
			
			default: System.out.println("Enter valid choice");
			}
		} while(ch != 0);
		
		

	}

	}


