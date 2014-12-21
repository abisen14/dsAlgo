package com.abhinav.algorithm.data_structures;

public class Stack {
	private int size;
	private int top;
	private int[] stackArray;
	
	public void Stack(int s){
		size = s;
		stackArray = new int[size];
		top = -1;
	}
	
	public void push(int number){
		stackArray[++top] = number;
	}
	
	public int pop(int number){
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top ==-1);
	}
	public boolean isFull(){
		return (top == size);
	}

}
