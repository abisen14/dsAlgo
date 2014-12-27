package com.abhinav.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] mergeArray = {32,12,9,68,112,43,23,89,1};
	
	public static void main (String[] args){
		
	     //int[] mergeArray = new int[9];
	     int[] tempArray = new int[mergeArray.length];
	     
	     mergeSort(tempArray, 0, mergeArray.length-1);
	     System.out.println("Sorted array is" + Arrays.toString(tempArray));
	}

	public static  void mergeSort(int[] tempArray, int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		if (lowerBound == upperBound){
			return;
		}
		else{
			int mid = (lowerBound + upperBound)/2 ;
			
			mergeSort(tempArray, lowerBound, mid);
			mergeSort(tempArray, mid+1, upperBound);
			//System.out.println("Merge is called with lowerBoud :"+lowerBound + "  mid : "+ mid + "  upperbound: "+upperBound);
			merge(tempArray, lowerBound, mid+1, upperBound);
		}
		
	}

	public static void merge(int[] tempArray, int lowerptr, int hightptr,
			int upperBound) {
		// TODO Auto-generated method stub
		int j =0;
		int lowerBound = lowerptr;		
		int mid = hightptr -1;
		int n = upperBound - lowerBound +1;
		
		while (lowerptr <= mid && hightptr <= upperBound){
			if(mergeArray[lowerptr] < mergeArray[hightptr]){
				
				tempArray[j++] = mergeArray[lowerptr++];				
			}
			else
				tempArray[j++] = mergeArray[hightptr++];
			
		}
		while (lowerptr <= mid){
			tempArray[j++] = mergeArray[lowerptr++];
		}
		while (hightptr <= upperBound){
			tempArray[j++] = mergeArray[hightptr++];
		}
		
		for (j=0; j<n; j++){
			mergeArray[lowerBound +j] = tempArray[j];
		}
		
	}
	
	
}
