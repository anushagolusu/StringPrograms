package com.practice;

import java.util.Scanner;

public class OccurenceCounter {
	static int getCount(int[] inputArray, int givenNumber){
		int count = 0;
		
		if(inputArray == null || inputArray.length == 0){
			return -0;
		}
		
		for(int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] == givenNumber)
            {
                count++;
            }
        }
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int n, givenNumber;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int inputArray[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
        	inputArray[i] = s.nextInt();
        }

        System.out.print("Enter the element of which you want to count number of occurrences:");
        givenNumber = s.nextInt();
        System.out.print("result :" +getCount(inputArray, givenNumber));
        
	}
}
