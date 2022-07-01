package com.revature.jdbc;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String job;
	private int salary;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", job=" + job
				+ ", salary=" + salary + ", squires=" + squires + "]";
	}
	private int squires;
	
	public int getSquires() {
		return squires;
	}
	public void setSquires(int squires) {
		this.squires = squires;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String firstName, String lastName, String job, int salary, int squires) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
		this.squires = squires;
	}
	public Employee() {
		super();
	}
	
}
