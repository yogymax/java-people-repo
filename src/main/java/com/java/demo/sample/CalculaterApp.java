package com.java.demo.sample;

public class CalculaterApp {
	
	
	public int addition(int num1,int num2) throws Exception {
		int result = 0;
		if(num1<=0 || num2<=0) {
			throw new Exception("Invalid Numbers...!");
		}
		result = num1  + num2;
		return result;
	}
	
	public String authentication(String username,String password) throws Exception {
		String result = "Login Successful";
		if(username==null || password ==null || username.length()<=4  || username==null || password.length()<=4 ) {
			throw new Exception("Invalid Input Params...!");
		}else if(username.equals("Yogesh") && password.equals("Yogesh123")) {
			return result;
		}else {
			return "Invalid Credentails";
		}
	}

}
