package com.practice;

import java.util.Arrays;

public class ArrayNearestMinValue {
	static int getNearestMinValue(int[] input_array){
		int result = 0;
		if(input_array == null || input_array.length == 0){
		return result;
		}
		Arrays.sort(input_array);
		int min = input_array[0];
		result = min-1;
		return result;
		
	}
	public static void main(String[] args) {
		
		int[] input_array= {-13, -4, -5, -1, -24};
		System.out.println("Output: "+getNearestMinValue(input_array));
		}

}
