package com.revature.jdbc;

import java.util.List;

/**
 * This interface will declare methods for common CRUD DB operations
 * @author micha
 *
 */
public interface EmployeeDao {
	public Employee getEmployee(int id);
	
	List <Employee> getAllEmployees();
	
	void createEmployee(Employee e);
	
	
	void deleteEmployee(int id);

	void updateEmployee(int id, String colName, int field);
	
	void updateEmployee(int id, String colName, String field);

}
