package com.abhinav.algorithm.StringManipulation;

import com.abhinav.algorithm.data_structures.Stack;

public class WordReversal {
	public static void main(String [] arg){
		String testWord = "Reporters";
		String output ="";
		Stack stackObj = new Stack(testWord.length());
		
	    for (int i =0; i < testWord.length(); i++){
	    	char ch = testWord.charAt(i);
	    	stackObj.push(ch);
	    }
	    
	    for (int j=0; j< testWord.length(); j++){
	    	char outCh = (char) stackObj.pop();
	    	output = output + outCh;	    	
	    	
	    }
	    System.out.println(" Output of reverse word is :" + output);
	}
	
    
}
