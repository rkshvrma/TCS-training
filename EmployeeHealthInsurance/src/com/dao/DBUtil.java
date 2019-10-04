package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.Oracledriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		return con;
	}
	
	public static void closeDBConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}
	
}
