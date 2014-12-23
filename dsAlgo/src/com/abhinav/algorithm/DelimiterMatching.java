package com.abhinav.algorithm;
/**
 * 1. Push the opening delimiters onto the stack.
 * 2. As soon as a closing delimiter is encountered check if stack is empty if so its an error.
 * 3. If stack is not empty pop last delimiter from stack and compare for correctness.
 * 4. At the end stack should be empty if not return error.
 */

import com.abhinav.algorithm.data_structures.Stack;

public class DelimiterMatching {
	public static void main(String[] arg){
		
		String testString = "a{b[c]d(e)}[fgh]";
		Stack testStack = new Stack(testString.length());
		
		for(int i =0; i<testString.length(); i++){
			char ch = testString.charAt(i);
			switch(ch){
			case '{':
			case '[':
			case '(':
				testStack.push(ch);
				break;
			case ']':
			case '}':
			case ')':
				if (testStack.isEmpty()){
					System.out.println("Failed");
				}
				else{
					char chx = (char) testStack.pop();
					if ( (ch == '}' && chx!= '{') || (ch == ']' && chx!= '[') || (ch == '(' && chx ==')') )
						System.out.println(" This Failed");
				}
				break;
			}
		}
			if(!testStack.isEmpty())
				System.out.println("Failed unmatched closing delimiter");	
				
			
			}
			
		}
	
