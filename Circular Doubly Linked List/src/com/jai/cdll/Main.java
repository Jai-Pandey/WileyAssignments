package com.jai.cdll;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		CircularDoublyLL linkedList = new CircularDoublyLL();
		while (true) {
			int ch;
			System.out.println("press 0 for Display and 1 for Insert and 2 for delete and else to Exit");
			ch = scanner.nextInt();
			if(ch == 0)
				linkedList.displayList();
			else if (ch == 1) {
				System.out.println("Enter an element");
				linkedList.insertElement(scanner.nextInt());
			} else if (ch == 2) {
				System.out.println("Delete an element");
				linkedList.deleteElement(scanner.nextInt());
			} else {
				System.out.println("OOPS:Encounter!");
				break;
			}
		}


	}

}
