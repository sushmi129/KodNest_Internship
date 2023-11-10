package com.UpdateDemo;

import java.sql.*;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		
		// User input
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter jersey number : ");
		int jer = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter name : ");
		String name = sc.nextLine();
		// JDBC code
		String sql = "UPDATE cricketers SET name = '"+name+"' WHERE jersey = '"+jer+"'";
		// Load the driver
		Class.forName(driver);
		
		// Establish the connection
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection established!");
		// For dynamic inputs preparing statement
		PreparedStatement ps = con.prepareStatement(sql);
		
		// Since we are using parameterized query we don't need to set the parameter values explicitly 
		//ps.setInt(1,jer);
		//ps.setString(2, name);
		
		ps.executeUpdate();
		System.out.println("Successfully updated!!");
	}

}
