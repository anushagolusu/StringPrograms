package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class NumberListString {
	static String display(String str) {
        String res = "";
        str = str.replaceAll("-", ",");
        str = str.replaceAll(",", " ");
        String[] strarr = str.split(" ") ;
        Arrays.sort(strarr);
        int start = Integer.parseInt(strarr[0]) ;
        int end = Integer.parseInt(strarr[strarr.length-1]) ;
        for(int i = start ;i <= end ; i++) {
            res += i+" " ;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value : ");
        String str  = sc.nextLine();
        System.out.println(display(str));
        
    }
}
