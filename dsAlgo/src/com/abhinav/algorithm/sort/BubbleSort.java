package com.abhinav.algorithm.sort;
/*
 * Running time O(n*n)
 */
import static java.lang.System.*;
import java.util.Arrays;



public class BubbleSort {

	public static void main(String args[]){
		
		int i,j;
		int testArray[] = {24,12,92,34,67};		
		System.out.println("Content of Array is :" + Arrays.toString(testArray));
		
		for(i= testArray.length -1 ; i >=0 ; i--){
			for (j = 0; j < i; j++){
				if (testArray[j] > testArray[j+1]){
					 int temp = testArray[j];
					 testArray[j] = testArray[j+1];
					 testArray[j+1] = temp;	
				}
				   
			}
		}
		System.out.println("Content of Array after the sort :" + Arrays.toString(testArray));
			
		}
	   					
	}


	

