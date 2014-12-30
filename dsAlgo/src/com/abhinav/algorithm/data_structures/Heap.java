package com.abhinav.algorithm.data_structures;

class Node{
	private int data;
	public Node (int number){
		data = number;
	}
	public int getData(){
		return data;
	}
	public void setData(int num){
		data = num;
	}
}

class HeapTree{
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public HeapTree(int number){
		maxSize = number;
		currentSize = 0;
		heapArray = new Node[maxSize];		
	}
	
	
	public boolean isEmpty(){
		return currentSize==0;
	}
	
	
	public boolean insert (int key){
		
		if(currentSize == maxSize){
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		tickelUp(currentSize++);
		return true;
	}
	
	public void tickelUp(int index){
		int parent = (index -1)/2;
		Node bottom = heapArray[index];
		while (heapArray[parent].getData() < bottom.getData() && index > 0){
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent -1)/2;
		}
		
		heapArray[index] = bottom;
	}
	
	public Node remove(){
		
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		tickelDown(0);
		return root;
	}
	
	public void tickelDown(int index){
		int largeChild;
		Node top = heapArray[index];
		while (index < currentSize/2){                //Has at least one child
			int leftChild = 2*index +1;
			int rightChild = leftChild + 1;
			
			if(rightChild < currentSize            //means right child exists
					                  && heapArray[leftChild].getData() < heapArray[rightChild].getData())
				largeChild = rightChild;
			else
				largeChild = leftChild;
			if (top.getData() >= heapArray[largeChild].getData())
				break;
			heapArray[index] = heapArray[largeChild];
            index = largeChild;					
		}
		heapArray[index] = top;
	}
}
public class Heap {

}
