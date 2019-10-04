package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.booking;
import com.util.DBUtil;

public class DriveDataOracle implements TestDrive {

	public DriveDataOracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<booking> viewBookings(int date) {

		ArrayList<booking> results = new ArrayList<booking>();

		Connection con = null;
		try {
			con = DBUtil.getDBConnection();

			PreparedStatement searchQuery = con.prepareStatement("SELECT * FROM tbl_booking where proposeddate = ?");

			ResultSet rs = searchQuery.executeQuery();
			while (rs.next()) {
				int bookId = rs.getInt("bookingid");
				String custName = rs.getString("customername");
				int licenseNo = rs.getInt("Licenseno");
				String vehiMake = rs.getString("vehiclemake");
				int date1 = rs.getInt("proposeddate");

				results.add(new booking(bookId, custName, licenseNo, vehiMake, date1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeDBConnection(con);
			} catch (SQLException e) {
				System.out.println("Closing connection failed.");
			}
		}

		return results;
	}

	@Override
	public int cancelBooking(int bookingId) {

		int driveCancelled = 0;

		Connection con = null;
		try {
			con = DBUtil.getDBConnection();

			PreparedStatement cancelQuery = con.prepareStatement("DELETE FROM tbl_booking WHERE bookingid=?");

			cancelQuery.setInt(1, bookingId);

			driveCancelled = cancelQuery.executeUpdate();
		} catch (SQLException e) {
		} finally {
			try {
				DBUtil.closeDBConnection(con);
			} catch (SQLException e) {
				System.out.println("Closing connection failed.");
			}
		}
		return driveCancelled;

	}

	@Override
	public boolean testDriveBooking(booking book) {
		boolean created = false;

		if (book != null) {
			Connection con = null;
			try {
				con = DBUtil.getDBConnection();

				PreparedStatement bookDriveQuery = con.prepareStatement("INSERT INTO tbl_booking"
						+ "(bookingid,customername,Licenseno,vehiclemake,proposeddate) " + "VALUES (?,?,?,?,?)");
				bookDriveQuery.setInt(1, book.getBookingId());
				bookDriveQuery.setString(2, book.getCustomerName());
				bookDriveQuery.setInt(3, book.getLicenseNo());
				bookDriveQuery.setString(4, book.getVehicleMake());
				bookDriveQuery.setInt(5, book.getProposedDate());

				created = bookDriveQuery.executeUpdate() > 0;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					DBUtil.closeDBConnection(con);
				} catch (SQLException e) {
					System.out.println("Closing connection failed.");
				}
			}
		}

		return created;
	}
}
