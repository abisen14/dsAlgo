package com.abhinav.algorithm.data_structures;

import java.io.IOException;

class Node{
	
	public int data;
	public Node leftChild;
	public Node rightChild;
	
}

class Tree{
	
	private Node root;
	
	public Tree(){
		root = null;
	}
	
	public Node find(int number){
		
		Node current = root;
		
		while(current.data != number){
			if(current.data > number)
				current = current.leftChild;
			else
				current = current.rightChild;						
		}
		return current;
	}
	
	public void insert(int number){
		
		Node newNode = new Node();
		newNode.data = number;
		if (root == null){
			root = newNode;
			//System.out.println(root.data);
		}
		else{
			//System.out.println(root.data);
			Node current = root;
			//System.out.println(current.data);
			Node parent;
			//System.out.println("Befor Whilee:::: " +current.data);
			while(true){
				//System.out.println("Before:::: " +current.data);
				parent = current;
				//System.out.println("This:::: " +parent.data);
				if(number < current.data){
					//System.out.println("if");
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						return;
					}
				}
				else{
					//System.out.println("else");
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
					    return;
					}
				}
			}
		}
	}
	
	public boolean deleteNode(int number){
		
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while (current.data != number){
			parent = current;
			if(number < current.data){
				isLeftChild = true;
				current = current.leftChild;
			}
			else{
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null)
				return false;
		}
		
		//Case 1: No child just delete the node
		
		if(current.leftChild == null && current.rightChild == null){
			if (current == root)
				root = null;
			else if(isLeftChild){
				parent.leftChild =null;
			}
			else
				parent.rightChild = null;
		}
		
		//Case 2: One child (right). Replace with left sub-tree
		
		else if ( current.rightChild == null){
			if (current == root){
				root = current.leftChild;
				
			}
			else if (isLeftChild){
				parent.leftChild = current.leftChild;
			}
			else
				parent.rightChild = current.leftChild;
		}
		
		//Case 2b: One child (left). Replace with right subtree
		else if(current.leftChild == null){
			if(current ==root){
				root = current.rightChild;
			}
			else if (isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		}
		
		// Case 3: Two child. Replace with the in-order successor.
		// To find the successor traverse to the right of node to be deleted and then left and left till left is null.
		// Connect successors rightChild to its parent leftChild and replace node to be deleted with successor.
		
		else{
			Node successor = getSuccessor(current);
			
			if(current == root)
				root = successor;
			else if (isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			successor.leftChild = current.leftChild;
		}
		return true;
	}

	public Node getSuccessor(Node delNode) {
		// TODO Auto-generated method stub
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while(current!=null){
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if (successor != delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	public void inOrderTraversal(){
		inOrder(root);
	}
	
	public void preOrderTraversal(){
		preOrder(root);
	}
	public void postOrderTraversal(){
		postOrder(root);
	}
	
	
	public void inOrder (Node localRoot){
		if(localRoot != null){
			inOrder (localRoot.leftChild);
			System.out.println(localRoot.data + "  ");
			inOrder (localRoot.rightChild);
		}
	}
	
	public void preOrder (Node localRoot){
		
		if(localRoot != null){
			System.out.println(localRoot.data + "  ");
			preOrder (localRoot.leftChild);
			preOrder (localRoot.rightChild);
		}
	}
	
	public void postOrder (Node localRoot){
		if(localRoot != null){
			postOrder (localRoot.leftChild);
			postOrder (localRoot.rightChild);
			System.out.println(localRoot.data + "  ");
		}
	}
	
	
	
}

public class BinaryTree {
	public static void main(String[] args) throws IOException{
		Tree binaryTree = new Tree();
		binaryTree.insert(2);
		binaryTree.insert(110);
		binaryTree.insert(34);
		binaryTree.insert(7);
		binaryTree.insert(44);
		binaryTree.insert(78);
		binaryTree.insert(23);
		binaryTree.insert(148);
		binaryTree.insert(59);
		
		System.out.println("Tree in inorder is:");
		binaryTree.inOrderTraversal();
		
		System.out.println("Tree in preOrder is:");
		binaryTree.preOrderTraversal();
		
		System.out.println("Tree in postOrder is:");
		binaryTree.postOrderTraversal();
	}
	
	

}
