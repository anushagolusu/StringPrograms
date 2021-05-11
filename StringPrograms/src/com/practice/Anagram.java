package com.practice;

import java.util.Arrays;

public class Anagram {
	static String checkAnagrams(String word1, String word2) {
		
		if(word1 == null || word2 == null){
			return null;
		}
		
		if(word1.length() == word2.length()) {
		
			char[] charArray1 = word1.toLowerCase().toCharArray();
			char[] charArray2 = word2.toLowerCase().toCharArray();
		   
		    Arrays.sort(charArray1); 
		    Arrays.sort(charArray2);
		    
		    if(Arrays.equals(charArray1, charArray2)){
		    	return "Anagrams";
		    }
		    else{
		    	return "Not Anagrams";
		    }
			
		}else{
			return "Not Anagrams";
		}
		}
	public static void main(String[] args) {
		
		String result = null;
		System.out.println(checkAnagrams("silent", "listen"));
	}

}
