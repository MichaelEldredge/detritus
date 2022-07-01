package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFistDemo {
	public static void main(String[] args) {
		// Step 1: load the driver class
		Connection connection = null;
		//Statement statement;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet;
		try {
			Class.forName("org.postgresql.Driver");
			
			// Step 2: Create a connection object by supllying url, user, and pwd
			connection = DriverManager.getConnection(
					System.getenv("DB_URL")+System.getenv("DB_NAME"),
					System.getenv("DB_USER"),
					System.getenv("DB_PASS"));
			System.out.println("Done");
			// Step 3: Create the Statement Object
			//statement = connection.createStatement();
			int id = 3;
			preparedStatement = connection.prepareStatement("select * from employee where id = ?");
			preparedStatement.setInt(1, id);
			
			// Step 4: Execute the Query and get the result of Query in resultSet
			resultSet = preparedStatement.executeQuery();
			
			// Step 5: Iterate over resultSet and display column values
			while(resultSet.next()) {
				System.out.println(
						resultSet.getInt("id")+" "
						+resultSet.getString("firstname") + " "
						+resultSet.getString(4)
				);
			}
			// Insert operation
			int inputId = -1;
			String inputFirstName = "Lift";
			String inputJob = "Edgedancer"; 
			
			PreparedStatement insertData= connection.prepareStatement("insert into employee (id, firstname, job) values(?,?,?)");
			insertData.setInt(1, inputId);
			insertData.setString(2, inputFirstName);
			insertData.setString(3, inputJob);
			
			insertData.execute();
			
			System.out.println("Data inserted");
			
			// update Operation
			int updateId=3;
			String updateFirstName = "Kaladin";
			
			PreparedStatement updateData = connection.prepareStatement("update employee set firstname = ? where id = ?");
			updateData.setString(1,updateFirstName);
			updateData.setInt(2, updateId);
			
			updateData.executeUpdate();
			System.out.println("Data updated");
			
			// Delete Operation
			int deleteId = -1;
			PreparedStatement deleteData = connection.prepareStatement("delete from employee where id = ?");
			deleteData.setInt(1,deleteId);
			
			deleteData.execute();
			System.out.println("Data deleted");
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// Step 6: Close the connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
