/**
 * 
 */
package com.abhinav.algorithm.search;

/**
 * @author Abhinav
 *
 */

import static java.lang.System.*;


class SortedArray {
	private int numElements;
	private int[] sortedArray;
	
	public SortedArray(int size){
		sortedArray = new int[size];
		numElements = 0;
	}
/**
 * Binary Search without using recursion	
 * @param key
 * @return
 */
	public int searchWithoutRecursion (int key){
		
		int mid;
		int lowerBound = 0;
		int upperBound = numElements - 1;
		
		while(true){
			
			mid = (lowerBound + upperBound)/2;
			if (sortedArray[mid] == key)
				return mid;
			else if (lowerBound > upperBound)
				return numElements;
			else {
				if (sortedArray[mid] > key)
					upperBound = mid -1;
				else
					lowerBound = mid +1;
			}
		}
	}
	
	public void insert (int number){
		
		int x;
		for (x = 0; x < numElements; x++){
			if (sortedArray[x] > number)
				break;			
		}
		for (int y = numElements; y > x; y--){
			
			sortedArray[y] = sortedArray[y-1];
		}
		sortedArray[x] = number;
		numElements++;
		
		
	}
	
	}

public class BinarySearch {

	public static void main(String[] args) {
		int arraySize = 10;
		SortedArray sarray;
		sarray = new SortedArray(arraySize);
		
	    sarray.insert(10);
	    sarray.insert(110);
	    sarray.insert(92);
	    sarray.insert(132);
	    sarray.insert(46);
	    sarray.insert(12);
	    
	    int skey = 92;
	    
	    if (sarray.searchWithoutRecursion(skey) != 6)
	        System.out.println("Found it!!");
	    else 
	    	System.out.println("Can't find!!");
	    	
	}
	

	    
	    
		
	}

