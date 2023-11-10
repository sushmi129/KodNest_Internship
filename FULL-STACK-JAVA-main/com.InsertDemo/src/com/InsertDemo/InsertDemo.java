package com.InsertDemo;
import java.sql.*;
import java.util.*;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		
		// User input
		Scanner sc = new Scanner(System.in);
		String sql = "insert into members values(?,?,?)";
		
		/*System.out.print("Please enter jersey number : ");
		int jer = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter name : ");
		String name = sc.nextLine();
		*/
		String usern = sc.nextLine();
		String email = sc.nextLine();
		String passw = sc.nextLine();
		// JDBC code
		
		// Load the driver
		Class.forName(driver);
		
		// Establish the connection
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection established!");
		// For dynamic inputs preparing statement
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,usern);
		ps.setString(2, email);
		ps.setString(3, passw);
		
		ps.executeUpdate();
		System.out.println("Successfully inserted!!");
	}

}
