package com.practice;

import java.util.Scanner;

public class MorseCode {
	static String getMorseCode(String input){
		
		
		if(input == null){
			return "Null String";
		}
		if(input.isEmpty()){
			return "Empty String";
		}
		
		if(!input.matches("^[a-z]*")){
			return "Invalid Letters";
		}
		
		StringBuffer buffer = new StringBuffer();
		
		for(char c : input.toCharArray()){
			buffer.append(retrieveMorceCode(c));
		}
		
		return buffer.toString();
	}
	
	static String retrieveMorceCode(char x) 
        {
		switch (x) 
        {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
            
        }
        return "";
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		System.out.println("Result : " +getMorseCode(input));
		
		
	}

}
