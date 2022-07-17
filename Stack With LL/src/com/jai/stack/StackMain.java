package com.jai.stack;
import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> llStack = new Stack<Integer>();
		int ch;
		do {
			System.out.println("1. Push \n2. Pop \n0. Exit");
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.print("Enter element : ");
					llStack.push(sc.nextInt());
					break;
			
			case 2: System.out.println("Deleted element = " + llStack.pop());
					break;

			case 0: System.exit(0);
			
			default: System.out.println("Enter valid choice");
			}
		} while(ch != 0);
	}

}