package com.abhinav.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
	
	public static int[] quickArray = {7,2,1,6,8,5,3,4};
	
	public static int partition(int[] A, int startIndex, int endIndex){
		
		int pivot = quickArray[endIndex];
		int partitionIndex = startIndex;
		for (int i =startIndex; i < endIndex ; i++){
			if (quickArray[i] <= pivot){
				swap (i, partitionIndex);
				partitionIndex++;
			}
			
		}
		swap (partitionIndex, endIndex);
		return partitionIndex;		
	}
	
	public static void swap(int x, int y){
		int temp;
		temp = quickArray[x];
		quickArray[x] = quickArray[y];
		quickArray[y] = temp;
	}
	
	public static void quickSort(int[] array, int start, int end){
		if (start < end){
			
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1);
			quickSort(array, pivot+1, end);
			
		}
	}
	public static void main(String[] arg){
		
		System.out.println("Unsorted array is:  " + Arrays.toString(quickArray));
		
		quickSort(quickArray, 0, quickArray.length -1);
		
		System.out.println("Sorted array is:  " + Arrays.toString(quickArray));
		
		
	}

}
