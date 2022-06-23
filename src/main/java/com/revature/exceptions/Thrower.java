package com.revature.exceptions;

public class Thrower {
	public static void main(String[] args) {
		System.out.println("Start of main");
		try{
			System.out.println("Start of try");
			System.exit(0);
			method1();
			System.out.println("End of try");
		}
		catch(Exception e) {
			System.out.println("Start of catch");
			System.out.println(e.toString());
			System.out.println("End of catch");
		}
		finally {
			System.out.println("Finally block");
			System.out.println("Goodby my friend.");
		}
		System.out.println("End of main");
	}
	
	public static void method1() throws MyException {
		System.out.println("Start of method1");
		method2();
		System.out.println("End of method1");
	}
	
	public static void method2() throws MyException {
		System.out.println("Start of method2");
		throw new MyException();
		// The next line prevents the code from compiling
		//System.out.println("End of method2");
	}
}
