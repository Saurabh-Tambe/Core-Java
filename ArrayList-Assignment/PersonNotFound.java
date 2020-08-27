package com.exception;

 



public class PersonNotFound extends Exception {

    private String message;
	
	public PersonNotFound() {
		// TODO Auto-generated constructor stub
	}
	public PersonNotFound(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = message;
		
	}
	
	public void displayMessage() {
		System.out.println(getMessage());
	}


}
 
