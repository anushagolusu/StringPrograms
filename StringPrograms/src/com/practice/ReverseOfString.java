package com.practice;

public class ReverseOfString {
	static String reverse(String s){
    	String res = " ";
    	for(int i=s.length()-1;i>=0;i--) {
    		if(i==(s.length()-1)) {
    			res+=s.substring(i,i+1).toUpperCase();
    		}
    		else {
    			res+=s.charAt(i);
    		}
    	} return res;
    }
	public static void main(String[] args) {
    String str = "Java is a programming language";
    String[] arr  = str.split(" ");
    System.out.println(str);
    for(String s:arr){
    	System.out.print(reverse(s));
    }
    
  }
}
