package com.revature.exceptions;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "This is the new message. - MGE";
	}
}
