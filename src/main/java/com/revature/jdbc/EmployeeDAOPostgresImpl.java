package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.jdbc.utils.ConnectionUtils;

public class EmployeeDAOPostgresImpl implements EmployeeDao{

	@Override
	public Employee getEmployee(int id) {
		Employee e = null;
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("Select * from employee where id = ?");
			fetchEmpById.setInt(1, id);
			ResultSet rs = fetchEmpById.executeQuery();
			while(rs.next()) {
				e = new Employee();
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setJob(rs.getString(4));
				e.setSalary(rs.getInt(5));
				e.setSquires(rs.getInt(6));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> returnme = new ArrayList<Employee>();
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("Select * from employee");
			ResultSet rs = fetchEmpById.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setJob(rs.getString(4));
				e.setSalary(rs.getInt(5));
				e.setSquires(rs.getInt(6));
				returnme.add(e);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnme;
	}

	@Override
	public void createEmployee(Employee emp) {
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("insert into employee values (?,?,?,?,?,?)");
			fetchEmpById.setInt(1, emp.getId());
			fetchEmpById.setString(2, emp.getFirstName());
			fetchEmpById.setString(3, emp.getLastName());
			fetchEmpById.setString(4, emp.getJob());
			fetchEmpById.setInt(5, emp.getSalary());
			fetchEmpById.setInt(6, emp.getSquires());
			fetchEmpById.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(int id, String colName, int field) {
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("update employee set "+colName+" = "+field+" where id = " + id);
			// This does not take advantage of the functionality of PreparedStatement
			// TODO: Find out how to make the following work.
			// It has something to do with the handling string objects and string literals.
			
			//fetchEmpById.setString(1, "salary");
			//fetchEmpById.setString(2, field);
			//fetchEmpById.setInt(3, id);
			fetchEmpById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int id) {
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("delete from employee where id = ?");
			fetchEmpById.setInt(1, id);
			fetchEmpById.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(int id, String colName, String field) {
		try {
			Connection conn = ConnectionUtils.getInstance().getConnection();
			PreparedStatement fetchEmpById = conn.prepareStatement("update employee set "+colName+" = '"+field+"' where id = " + id);
			// This does not take advantage of the functionality of PreparedStatement
			// TODO: Find out how to make this work as with the other updateEmployee method
			// It has something to do with the handling string objects and string literals.
			
			fetchEmpById.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
