package EmployeeManagement;

import java.sql.*;
public class ConnectDB {
	public static Connection getConnection() throws SQLException
	   {
		 String url = "jdbc:mysql://localhost:3306/employee_db";
	     String userName = "";
	   	 String password = "";
	   	 Connection con = DriverManager.getConnection(url, userName, password);
	     return con;
	   }

}
