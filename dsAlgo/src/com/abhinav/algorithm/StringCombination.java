package com.abhinav.algorithm;

public class StringCombination {
	
	private static StringBuilder out = new StringBuilder();
	public final static String input = "abcd";
    
	public static void main(String[] args){
		int start = 0;
		combine(start);
		//public void combine(int start){
			
		//}
		
	}

	private static void combine(int start) {
		// TODO Auto-generated method stub
		for (int i = start; i < input.length(); i++){
			out.append(input.charAt(i));
			//System.out.println("Char at i : " + i + "is : "+ input.charAt(i));
			System.out.println(out);
			if (i < input.length())
				combine(i+1);
			out.setLength(out.length()-1);
			//System.out.println("New Out:  " +out);
		
	}

}
}
