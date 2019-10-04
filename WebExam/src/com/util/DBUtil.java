package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

		return con;
	}

	public static void closeDBConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

}
