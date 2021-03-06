package com.jai.BST;

public class MinMaxInBST {
		
	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
		}
		
	}
	
	Node root;
	
	// insertion
	public void insert(int key) {
		root=insertRec(root, key);
	}
	private Node insertRec(Node root,int key) {
		
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left, key);
		else if(key>root.key)
			root.right=insertRec(root.right, key);
		
		return root;
	}
	
	//inorder traversal
	public void inorderTraversal() {
		inorderRec(root);
	}
	
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
	//postorder
	
	public void postorderTraversal() {
		printPostorder(root);
	}
	
	void printPostorder(Node node)
    {
        if (node == null)
            return;
  
        // first recur on left subtree
        printPostorder(node.left);
  
        // then recur on right subtree
        printPostorder(node.right);
  
        // now deal with the node
        System.out.print(node.key + " ");
    }
	
	//preorder
	
	public void preorderTraversal() {
		printPreorder(root);
	}
	
	void printPreorder(Node node)
    {
        if (node == null)
            return;
  
        /* first print data of node */
        System.out.print(node.key + " ");
  
        /* then recur on left subtree */
        printPreorder(node.left);
  
        /* now recur on right subtree */
        printPreorder(node.right);
    }
	
	//Deletion
	public void delete(int element) {
		root = deleteNode(root,element);
	}
	
	private Node deleteNode(Node root,int element) {
		if(root==null)
		{
			return root;
		}
		else if(root.key>element)
		{
			root.left = deleteNode(root.left, element);
		}
		else if(root.key<element)
		{
			root.right = deleteNode(root.right, element);
		}
		else
		{
			if(root.left==null&&root.right==null)
            {
                return null;
            }
			else if(root.left==null||root.right==null)
            {
                if(root.left!=null)
                {
                    return root.left;
                }
                else{
                    return root.right;
                }
            }
			root.key = min(root.right);
            root.right = deleteNode(root.right, root.key);
		}
		return root;
	}
	
	public int minTree() {
		return min(root);
	}
	private int min(Node root) {
		if(root.left==null)
			return root.key;
		int temp=min(root.left);
		return temp;
	}
	
	//max
	public int highest() {
		Node curr =root;
		while(curr.right!=null)
			curr = curr.right;
		return curr.key;
	}
	
	//min
	public int lowest() {
		Node curr =root;
		while(curr.left!=null)
			curr = curr.left;
		return curr.key;
	}
	
	//leaf node counting
	
	public int countL()
	{
		return countLeaf(root);
	}
	private int countLeaf(Node root) {
		if(root==null)
			return 0;
		
		
		if(root.left==null && root.right==null)
		{
		 return 1;
		}
		
		int count=0;
		count += countLeaf(root.left)+countLeaf(root.right);
		return count;
	
	}
	
	//height
	
	
	 int maxDepth(Node node)
	    {
	        if (node == null)
	            return 0;
	        else
	        {
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.left);
	            int rDepth = maxDepth(node.right);
	  
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	             else
	                return (rDepth + 1);
	        }
	    }
}


