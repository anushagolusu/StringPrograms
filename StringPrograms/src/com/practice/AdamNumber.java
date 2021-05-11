package com.practice;

public class AdamNumber {
	static boolean isAdamNumber(int input) {
		int a = square(input); 
	        int b = square(getReverse(input)); 
	        if (a == getReverse(b)) {
	        	return true;
	        }
	        return false;
		}
		
  static int getReverse(int inputNumber){
			int reverseNumber = 0;
			while (inputNumber > 0) { 
				reverseNumber = reverseNumber * 10 + inputNumber % 10; 
				inputNumber = inputNumber/10; 
	                }
			return reverseNumber;
		}
		
	static int square(int num) {
	        return (num * num); 
	 } 

		public static void main (String[] args) {
		 int num = 17; 
	     System.out.println(isAdamNumber(num));
	    }

}
