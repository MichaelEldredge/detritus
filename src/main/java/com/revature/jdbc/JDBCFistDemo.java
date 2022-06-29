package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFistDemo {
	public static void main(String[] args) {
		// Step 1: load the driver class
		Connection connection = null;
		Statement statement;
		ResultSet resultSet;
		try {
			Class.forName("org.postgresql.Driver");
			
			// Step 2: Create a connection object by supllying url, user, and pwd
			connection = DriverManager.getConnection(
					"jdbc:postgresql://eldredge-db.cgowkndpltah.us-west-1.rds.amazonaws.com/LearnDB",
					"postgres",
					"Pi314159");
			System.out.println("Done");
			
			// Step 3: Create the Statement Object
			statement = connection.createStatement();
			
			// Step 4: Execute the Query and get the result of Query in resultSet
			resultSet = statement.executeQuery("select * from employee");
			
			// Step 5: Iterate over resultSet and display column values
			while(resultSet.next()) {
				System.out.println(
						resultSet.getInt("id")+" "
						+resultSet.getString("firstname") + " "
						+resultSet.getString(4)
				);
			}
			
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
