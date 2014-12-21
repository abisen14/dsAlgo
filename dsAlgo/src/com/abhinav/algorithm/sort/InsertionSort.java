package com.abhinav.algorithm.sort;
/*
 * Running time O(n*n) but eliminates swaps that is more time consuming than comparisons. 
 * Works very well for almost sorted elements.
 */

import static java.lang.System.*;

import java.util.Arrays;

public class InsertionSort {
	 public static void main(String args[]){
			
		    int i,j;
		    int testArray[] = {24,12,92,34,67};		
		    System.out.println("Content of Array is :" + Arrays.toString(testArray));
		    
		    for (i=1; i<testArray.length; i++){
		    	int temp = testArray[i];
		    	j = i;
		    	while(j >0  && testArray[j-1] >= temp){
		    		testArray[j]= testArray[j-1];
		    		--j;
		    	}
		    	testArray[j] = temp;
		    	
		    }
		    System.out.println("Content of Array after the sort :" + Arrays.toString(testArray));
	 }
}

