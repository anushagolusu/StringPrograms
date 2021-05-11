package com.practice;

public class StringsWithPattern {
	static String[] getWordsContainsPattern(String[] input, String pattern){
		
		String[] output = {""};

		String remainingString = "";
		
		if(input != null && input.length != 0 
				&& pattern != null && !pattern.isEmpty()){
			for(int i = 0; i < input.length; i++){
				if(input[i].toLowerCase().contains(pattern.toLowerCase())){
					if(remainingString.isEmpty()){
						remainingString = input[i];
					}else{
						remainingString = remainingString + ", " +input[i];;
					}
				}
			}
		}
		
		if(!remainingString.isEmpty()){
			System.out.println("remainingString : " +remainingString);
			output = remainingString.split(", ");
		}
		
		System.out.println("length : " +output.length);
		
		return output;
	}
	
	public static void main(String[] args) {
		
		String[] output=null ;
		
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India", "Australia", "Pakistan", "Bangladesh"};
	        String pattern = "an";
	        getWordsContainsPattern(words, pattern);
	        
	        for(String string: output){
	        	System.out.println("string : " +string);
	        }

	}
}
