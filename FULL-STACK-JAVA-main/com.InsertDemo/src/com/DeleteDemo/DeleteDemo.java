package com.DeleteDemo;


import java.sql.*;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		
		// User input
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter jersey number to delete : ");
		int jer = sc.nextInt();
		// JDBC code
		String sql = "DELETE FROM cricketers where jersey = '"+jer+"'";
		// Load the driver
		Class.forName(driver);
		
		// Establish the connection
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection established!");
		// For dynamic inputs we use preparing statement
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.executeUpdate();
		System.out.println("Successfully deleted!!");
	}

}