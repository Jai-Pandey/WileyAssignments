package com.jai.frequency;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BinarySearchTree<String> bst = new BinarySearchTree<>();
			FileFreq readFile = new FileFreq(bst);
			readFile.writer("Jai");
			readFile.reader("Jai");
			bst.inorderTraversal();
		}

	}