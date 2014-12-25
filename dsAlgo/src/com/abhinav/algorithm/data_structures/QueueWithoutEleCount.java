package com.abhinav.algorithm.data_structures;

public class QueueWithoutEleCount {
	private int front;
	private int rear;
	private int[] queueArray;
	private int queueSize;
	
	public QueueWithoutEleCount(int size){
		
		queueSize = size;
		queueArray = new int[queueSize];
		front = 0;
		rear = 0;
		
	}
	
	public boolean isEmpty(){
		return (rear == front);
	}
	
	public boolean isFull(){
		int sizeDiff = rear - front;
		if (sizeDiff == -1 || sizeDiff == queueSize)
			return true;
		return false;
		
	}
	
	public void insert(int number){
		if (isFull()){
			System.out.println("Queue is full cannot insert");
			return;
		}
		queueArray[rear] = number;
		rear = (rear+1) % queueSize;
		
	}
	
	public int delete(){
		if (!isEmpty()){
		    int temp = queueArray[front];
		    front = (front+1) % queueSize;
		    return temp;
		}
		else {
			System.out.println("Queue already empty !!");
			return 0;
		}
		
		
	}

}
