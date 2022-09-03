package com.JUnit;

public class Authentication {

	public boolean validate(String username ,String password) {
	
		if(username.equals("Pooja")&& password.equals("Pooja@20")) {
			
			System.out.println("Authentication Succesful");
			return true;}
			
		else {
			System.out.println("Authentication failed");
			return false;
			
		}
	}
}
