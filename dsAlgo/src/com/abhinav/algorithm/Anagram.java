package com.abhinav.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {
	static int size;
	static int count;
	static char[] wordArray = new char[10];
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter a word to do anagram");
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String input = br.readLine();
		size = input.length();
		count =1;
		for (int i =0; i <size; i++){
			wordArray[i] = input.charAt(i);
		}
		System.out.println("Anagram of string are:");
		anagramFunction(size);
		
		
	}

	public static void anagramFunction(int size2) {
		// TODO Auto-generated method stub
		if (size2 == 1)
			return;
		for (int j = 0; j < size2; j++){
			anagramFunction (size2 -1);
			if (size2 == 2)
				displayWord();
			rotateWord(size2);
		}
		
	}

	public static void rotateWord(int size2) {
		// TODO Auto-generated method stub
		int x;
		int position = size -size2;
		char temp = wordArray[position];
		for (x = position + 1; x < size; x++){
			wordArray [x -1]= wordArray[x];
		}
		wordArray[x -1] = temp;
	}

	public static void displayWord() {
		// TODO Auto-generated method stub
		System.out.println(" "+count++ + " "+ Arrays.toString(wordArray));
	}
}
