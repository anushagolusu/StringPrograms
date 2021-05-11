package com.practice;

public class CharCounter {
	static int findCountOfChar(String input, char toFind){
		if(input == null || input.isEmpty()){
			return -1;
		}
		
		int count = 0;
		for(int i = 0; i < input.length(); i++){
			if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(toFind)){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int result = 0;
		System.out.println(findCountOfChar("Hello world", 'l'));
		
	}

}
