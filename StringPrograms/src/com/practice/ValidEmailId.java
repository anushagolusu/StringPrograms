package com.practice;

public class ValidEmailId {
	static String isValidMailID(String mailId){
		
		if(mailId == null || mailId.isEmpty()){
			return "";
		}
		
		if(!Character.isLowerCase(mailId.charAt(0))){
			return "-1";
		}
		
		if(!mailId.contains("@")){
			return "-2";
		}
	
		if(mailId.contains("@") && (mailId.indexOf("@") != mailId.lastIndexOf("@"))){
			return "-3";
		}
		
		if(!(mailId.endsWith(".com") || mailId.endsWith(".co.in"))){
			return "-4";
		}
		String regex = "^[A-Za-z0-9+_.]+@(.+)$";
		
		if(!mailId.matches(regex)){
			return "-5";
		}
		
		return "Valid";
	}
	
	public static void main(String[] args) {
		
		String mailId = "u9@gmail.com";
		
		System.out.println(isValidMailID(mailId));
		
		
	}
}
