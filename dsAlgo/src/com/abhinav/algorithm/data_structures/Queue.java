package com.abhinav.algorithm.data_structures;

public class Queue {
	private int front;
	private int rear;
	private int queueSize;
	private int numElements;
	private int[] queueArray;
	
	public Queue (int size){
		queueSize = size;
		queueArray = new int[queueSize];
		front = 0;
		rear = -1;
		numElements = 0;
	}
	
	public void insert(int number){
		
		if (rear == queueSize -1){
			rear = -1;			
		}
		queueArray[++rear] = number;
		numElements++;
	}
	public int remove(){
		int temp = queueArray[front++];
		if (front == queueSize){
			front = 0;
		}
		numElements--;
		return temp;
		
	}
	
	public int front(){
		return queueArray[front];
	}
	
	public int rear(){
		return queueArray[rear];
	}
	
	public boolean isFull(){
		return (numElements == queueSize);
	}
	
	public boolean isEmpty(){
		return (numElements ==0);
	}
	
	public int items(){
		return numElements;
	}

}
