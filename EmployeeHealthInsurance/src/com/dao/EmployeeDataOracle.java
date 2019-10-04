package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.Employee;
import com.beans.Policy;

public class EmployeeDataOracle {

	public EmployeeDataOracle() {

	}

	public int addPolicy(Policy policy) throws SQLException {
		int msg = -1;
		Connection con = null;
		try {

			con = DBUtil.getDBConnection();

			String query = "INSERT INTO policy (Start_date, Peroid,sum_assured) VALUES (?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDate(1, policy.getStartDate());
			pstmt.setInt(2, policy.getPolicyPeriod());
			pstmt.setInt(3, policy.getSumAssured());
			pstmt.execute();

			ResultSet res = pstmt.getGeneratedKeys();

			if (res.next()) {
				msg = res.getInt(1);
			}

		} catch (ClassNotFoundException c) {

		} catch (SQLException c) {

		} finally {
			con.close();
		}

		return msg;
	}

	public int addEmployee(Employee emp) {
		if (emp == null)
			return -1;

		int added = 0;

		Connection con = null;
		try {
			con = DBUtil.getDBConnection();

			String query = "INSERT INTO employee (Emp_id,Emp_Name, " + "DOB,Gender,Email, "
					+ "Alt_Email, Phone_num, Alt_Phone, "
					+ "Policy_Id, AccountNum, BankName, RoutingNUM) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getEmployeeName());
			pstmt.setDate(3, emp.getEmployeeDob());
			pstmt.setString(4, emp.getEmployeeGender());
			pstmt.setString(5, emp.getEmployeeEmail());
			pstmt.setString(6, emp.getEmployeeAltEmail());
			pstmt.setString(7, emp.getEmployeePhone());
			pstmt.setInt(8, emp.getPolicyId());
			pstmt.setString(9, emp.getEmployeeBankAccount());
			pstmt.setString(10, emp.getEmployeeBankName());
			pstmt.setString(11, emp.getEmployeeIFSC());

			pstmt.execute();

			added = 1;

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		} finally {
			try {
				DBUtil.closeDBConnection(con);
			} catch (SQLException e) {
				System.out.println("Closing connection failed.");
			}
		}

		return added;
	}

}
