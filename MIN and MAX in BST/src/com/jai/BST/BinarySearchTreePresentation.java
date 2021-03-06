package com.jai.BST;

import java.util.Scanner;

public class BinarySearchTreePresentation {

	private MinMaxInBST  binarySearchTree=new MinMaxInBST ();
	public void showMenu() {
		System.out.println("1. Add element");
		System.out.println("2. Inorder Traversal");
		System.out.println("3. Postorder Traversal");
		System.out.println("4. Preorder Traversal");
		System.out.println("5. Exit");
		System.out.println("6. Find highest element");
		System.out.println("7. Find lowest element");
		System.out.println("8. Delete an element");
		System.out.println("9. Count Leaf Node");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter Element : ");
			binarySearchTree.insert(scanner.nextInt());
			System.out.println("Value Inserted");
			break;

		case 2:
			binarySearchTree.inorderTraversal();
			break;
			
		case 3:
			binarySearchTree.postorderTraversal();
			break;
			
		case 4:
			binarySearchTree.preorderTraversal();
			break;
			
		case 5:
			System.out.println("Thanks for using Binary Search Tree");
			System.exit(0);
		case 6:
			System.out.println("Highest :"+binarySearchTree.highest());
			break;
		case 7:
			System.out.println("Lowest :"+binarySearchTree.lowest());
			break;
		case 8: 
			System.out.println("Enter element");
			 binarySearchTree.delete(scanner.nextInt());
			break;
		case 9:
			System.out.println("Leaf Nodes :"+binarySearchTree.countL());
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}