package com.jai.sorted;

import java.util.Scanner;

public class LLMain {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
		LLSorted<Integer> linkedList=new LLSorted<Integer>();
	
		while (true) {
			int ch;
			System.out.println("press 0 for exit and 1 for Insert and 2 for delete: ");
			ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("Enter element");
				linkedList.insertElement(scanner.nextInt());
			} else {
				break;
			}
		}

		linkedList.displayList();
	}
}



