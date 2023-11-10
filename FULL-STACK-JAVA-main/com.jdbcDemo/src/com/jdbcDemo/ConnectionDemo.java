package com.jdbcDemo;

// import sql package
import java.sql.*;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		// define variables
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		
		// To create a table
		// String sql = "Create table cricketers(jersey number, name varchar2(20))";
		
		// Inserting values into table
		String sql = "insert into members values()";
		
		// To update a row in a table
		//String sql = "update cricketers set name='KOHLI' where jersey=18";
		
		// To delete a row
		//String sql = "delete from cricketers where jersey = 45";
		
		// To fetch the data
		//String sql = "Select * from cricketers";
		
		// load the driver
		Class.forName(driver);
		
		// establish connection
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection successfull!!");
		
		// Creating statement
		Statement st = con.createStatement();
		//st.execute(sql);
		
		// To execute update statement
		st.executeUpdate(sql);
		
		// getting ResultSet
		/*ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2));
		}*/
	}

}
