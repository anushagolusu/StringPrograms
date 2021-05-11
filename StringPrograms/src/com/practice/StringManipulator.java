package com.practice;

import java.util.Scanner;

public class StringManipulator {
	static String removeVowels(String input){
		
		if(input == null){
			return null;
		}
		
		String filteredString = input.replaceAll("[aeiouAEIOU]", "");
		return filteredString;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\s");
		System.out.print("Enter input");
		String input="";
		input+=s.nextLine();
		System.out.println("output : "+removeVowels(input));
		

	}
}
