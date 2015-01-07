package com.abhinav.algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*public class Combination {	
	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s =br.readLine();
		int l = s.length();
		char arr[]=s.toCharArray();			
		int k=2;
		Arrays.sort(arr);
		findAllCombine(arr,"",0,l,k);
}

	private static void findAllCombine(char[] arr, String prefix, int i, int l,int k) {		
		if(k==0)
		{
			System.out.println(prefix);			
			return;	
		}
		
			for(int j=i;j<l;j++)
			{	
				
				String newprefix=prefix+" "+arr[j];
				//System.out.println("i"+i+"j"+j);
				findAllCombine(arr, newprefix, i+1, l, k-1);
				
				while(j<l-1 && arr[j]==arr[j+1]){
					j++;
					i++;
				}
				i++;
			}		
			
	}

}*/
public class Combination {

    public static void main(String[] args) {

        // Create an alphabet to work with
        char[] alphabet = new char[] {'a','b','c'};
        // Find all possible combinations of this alphabet in the string size of 3
        StringExcersise.possibleStrings(3, alphabet,"");
    }

} class StringExcersise {

    public static void possibleStrings(int maxLength, char[] alphabet, String curr) {

        // If the current string has reached it's maximum length
        if(curr.length() == maxLength) {
            System.out.println(curr);

        // Else add each letter from the alphabet to new strings and process these new strings again
        } else {
            for(int i = 0; i < alphabet.length; i++) {
                String oldCurr = curr;
                curr += alphabet[i];
                possibleStrings(maxLength,alphabet,curr);
                curr = oldCurr;
            }
        }
    }
}



