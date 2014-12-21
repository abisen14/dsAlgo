package com.abhinav.algorithm.sort;

import static java.lang.System.*;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
		
		    int i,j;
		    int min;
		    int testArray[] = {24,12,92,34,67};		
		    System.out.println("Content of Array is :" + Arrays.toString(testArray));
		
		    for(i= 0; i < testArray.length -1 ; i++){
		    	min = i;
			    for (j = i+1; j < testArray.length; j++){
				    if (testArray[j] < testArray[min]){
				    	 min = j;
					 }
			    }
				int temp = testArray[i];
				testArray[i] =testArray[min];
				testArray[min] = temp;				   
			    
		    }
		    System.out.println("Content of Array after the sort :" + Arrays.toString(testArray));
			
		    }
}
