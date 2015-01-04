package com.abhinav.algorithm.StringManipulation;

import java.util.Arrays;

public class StringReversal {
	
	public static void main(String[] args){
		
		String str = " This string has to be reversed.";
		char[] stringArray = str.toCharArray();
		int start =0 , end =0, length = str.length();
		
		reverseString(stringArray, start, length - 1);
		while (end < length){
			if(stringArray[end] != ' '){
				start = end;				
				while (end < length && stringArray[end]!= ' ')
					end++;
				end --;
				reverseString(stringArray, start,end);
				
			}
			end ++;
		}
		
		System.out.println("The reversed string is:" + Arrays.toString(stringArray));
	}

	private static void reverseString(char[] stringArray, int start, int end) {
		// TODO Auto-generated method stub
		char temp;
		while (end > start){
			temp = stringArray[end];
			stringArray[end] = stringArray[start];
			stringArray[start] = temp;
			end -- ; start ++;
			
		}
	}

}
