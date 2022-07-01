package com.revature.jdbc;

import java.util.List;

public class JDBCMain {
	public static void main(String[] args) {
		EmployeeDAOPostgresImpl em = new EmployeeDAOPostgresImpl();
		Employee myEmployee = em.getEmployee(5);
		System.out.println(myEmployee.toString());
		
		Employee toAdd = new Employee(3, "Kaladin", "Stormblessed", "Windrunner", 500, 20);
		em.createEmployee(toAdd);
		
		em.deleteEmployee(3);
		
		em.updateEmployee(5, "job", "Spy");
		
		List <Employee> myList = em.getAllEmployees();
		for (int i = 0 ; i < myList.size(); i++) {
			myEmployee = myList.get(i);
			System.out.println(myEmployee.toString());
		}
		
		
		System.out.println("Reached the end");
	}
}
