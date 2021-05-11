package com.practice;

public class RotateArray {
	static int[] rotate(int[] arr, int nop) {
		
		if(arr == null){
			return null;
		}
		
		if(nop == 0){
			return arr;
		}
		
		for(int i = 0; i < nop; i++){  
                 int j, first;  
                 first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                 arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
		  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        } 
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4,5,6};
		int nop = 3;
		int result[] = rotate(arr, nop);
		
	}
}
