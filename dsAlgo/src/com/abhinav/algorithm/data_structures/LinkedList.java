package com.abhinav.algorithm.data_structures;

class Link{
	
	public int data;
	Link next;
	
	public Link(int number){
		data = number;
	}
	
	public void displayLink(){
		System.out.println("Link data is: " + data);
	}
}

public class LinkedList {
	
	private Link front;
	
	public LinkedList(){
		
		front = null;
	}
	
	public void insterFirst(int number){
		
		Link newLink = new Link(number);
		newLink.next = front;
		front = newLink;
	}
	
	public Link find(int key){
		
		Link current = front;
		
		while(current.data ==key)
		{
			if (current.next==null)
				return null;
			else		   
			current = current.next;
		}
		
		return current; 
	}
	
	public Link delete (int key){
		Link current = front;
		Link previous = current;
		
		while (current.data == key){
			if (current.next ==null)
				return null;
			else
				previous=current;
			    current = current.next;
		}
		if(current == front)
			front = front.next;
		else
			previous.next = current.next;
		return current;
		
	}
	
	public void displayList(){
		Link current = front;
		while (current != null){
			System.out.print("Content of linkedlist is : " + current.data);
			System.out.print("-->");
		}
	}
}

