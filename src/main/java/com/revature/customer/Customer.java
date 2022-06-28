package com.revature.customer;

public class Customer implements Comparable<Customer> {
	final String referedBy ;
	final String name;
	private static int totalCustomers = 0;
	private double spent = 0;
	
	public Customer(String customerName, String recruterName) {
		name = customerName;
		referedBy = recruterName;
		totalCustomers++;
	}
	public Customer(String customerName) {
		name = customerName;
		referedBy = null;
		totalCustomers++;
	}
	public void purchase(int amount) {
		spent += amount;
	}
	public void purchase(double amount) {
		spent += amount;
	}
	public static int getTotalCustomers() {
		return totalCustomers;
	}
	public String toString() {
		String returnme;
		if (referedBy == null)
			returnme = name + " spent $"+ spent;
		else
			returnme = name + " spent $"+ spent+ " and was refered by "+referedBy;
		return returnme;
	}
	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.name);
	}
}
