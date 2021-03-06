package com.jai.frequency;

public class BinarySearchTree<T extends Comparable<T>> {

	class Node{
		T key;
		Node left,right;
		int freq = 0;
		public Node(T key) {
			super();
			this.key = key;
			this.freq=1;
		}
		
	}
	
	Node root;
	
	public void insert(T key) {
		root=insertRec(root, key);
	}

	private Node insertRec(Node root, T key) {
		// if the tree is empty
		if (root == null) {
			root = new Node(key);
			return root;
		}
		int val = key.compareTo(root.key);
		if (val < 0)
			root.left = insertRec(root.left, key);
		else if (val > 0)
			root.right = insertRec(root.right, key);
		else
			root.freq += 1;
		return root;
	}
	
	
	public void inorderTraversal() {
		inorderRec(root);
	}
	
	//Left,root,right
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key+" having Frequency : "+root.freq);
			inorderRec(root.right);
		}
	}
}
