package com.jai.BST;

import java.util.Scanner;

public class BSTMain {

	public static void main(String[] args) {
		
				BinarySearchTreePresentation binarySearchTreePresentation=new BinarySearchTreePresentation();
				Scanner scanner=new Scanner(System.in);
				while(true) {
					binarySearchTreePresentation.showMenu();
					System.out.println("Enter Choice : ");
					int choice=scanner.nextInt();
					binarySearchTreePresentation.performMenu(choice);
				}
				
			}
		}
