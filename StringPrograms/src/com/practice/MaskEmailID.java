package com.practice;

public class MaskEmailID {
	static String maskMailID(String mailId){
		if(mailId == null || mailId.isEmpty()){
			return "";
		}
		
		String regex = "^[A-Za-z0-9+_.]+@(.+)$";
		
		if(!mailId.matches(regex)){
			return "invalid";
		}
		
		if(!(mailId.endsWith(".com") || mailId.endsWith(".co.in"))){
			return "invalid";
		}
		
		return mailId.replaceAll("(?<=.{2}).(?=[^@]*?@)", "*");
	}
	
	public static void main(String[] args) {

		String mailId = "test@gmail.com";
		System.out.println("Output: "+maskMailID(mailId));
		
	}

}
