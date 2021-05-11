package com.practice;

public class EvenNumbersSumFromArray {
	static int getSumOfEvenNumbers(int[] input){
		int result = 0;
		int sum = 0;
		
		if(input == null || input.length == 0){
			return -3;
		}
		
		
		for(int i : input){
			if(i < 0){
				//containNegetive = true;
				return -1;
			}
			if(i == 0){
				//containZero = true;
				return -2;
			}
			
			if(i%2==0){
				sum = sum+i;
			}
			
			
		}
		result = sum;
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {3,4,6};
		System.out.println("Result: "+getSumOfEvenNumbers(input));
		

	}
}
