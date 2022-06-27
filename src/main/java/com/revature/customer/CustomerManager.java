package com.revature.customer;

public class CustomerManager {
	public static void main(String[] args) {
		Customer c1 = new Customer("Alice","Bob");
		Customer c2 = new Customer("Eve");
		
		int myInt = 123;
				
		c1.purchase(myInt);
		c2.purchase(6.66);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(Customer.getTotalCustomers());
		
	}
}


