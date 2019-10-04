package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.rowset.BaseRowSet;

public class NavalMgmtDAO implements NavalMgmt {


	@Override
	public int addNavalOfficer(NavalOfficer navalOfficer) {

		Connection con = null;

		try {
			con = DBUtil.getDBConnection();

			String query = "insert into TBL_Officer(Officer_No,Officer_Name, Officer_Rank, Officer_Sal, Base_Camp_Id)"
					+ " values (?, ?, ?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, navalOfficer.getOfficerNo());
			pstmt.setString(2, navalOfficer.getOfficerName());
			pstmt.setString(3, navalOfficer.getOfficerRank());
			pstmt.setDouble(4, navalOfficer.getOfficerSal());
			pstmt.setInt(5, navalOfficer.getBaseCampId());

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			return -1;
		} catch (IllegalArgumentException e) {
			return -2;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	@Override
	public int addBaseCamp(BaseCamp baseCamp) {

		Connection con = null;

		try {
			con = DBUtil.getDBConnection();

			String query = "insert into TBL_Base_Camp(Base_Camp_Id,Base_Camp_Name, Base_Camp_Loc)"
					+ " values (?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, baseCamp.getBaseCampId());
			pstmt.setString(2, baseCamp.getBaseCampName());
			pstmt.setString(3, baseCamp.getBaseCampLoc());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			return -1;
		} catch (IllegalArgumentException e) {
			return -2;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}

	@Override
	public ArrayList<String> getOfficersNameSortedBySal() {
		ArrayList<String> getOfficersNames = new ArrayList<String>();
		Connection con = null;
		try {
			con  = DBUtil.getDBConnection();
			String query = "select Officer_Name from TBL_Officer order by Officer_Sal";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String OfficerName = rs.getString("Officer_Name");
			getOfficersNames.add(OfficerName);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return getOfficersNames;
	}

 
	@Override
	public ArrayList<String> getOfficersNameForBaseCampLoc(String baseCampLoc) {
		 
		ArrayList<String> getOfficeresNameBase = new ArrayList<String>();
		Connection con = null;
		try {
			con  = DBUtil.getDBConnection();
			String query = "select Officer_Name from TBL_Officer_1755484 tblo, TBL_Base_Camp_1755484 tblbc where tblo.Base_Camp_Id = tblbc.Base_Camp_Id and Base_Camp_Loc = 'KOLKATA';";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String OfficerName = rs.getString("Officer_Name");
			getOfficeresNameBase.add(OfficerName);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return getOfficeresNameBase;
	}


	@Override
	public double getOfficersTotalSalOnBaseCamp(int baseCampId) {
 
		Double getOfficersTotalSal = null;
		Connection con = null;
		try {
			con  = DBUtil.getDBConnection();
			String query = "select sum(Officer_Sal) as salary from TBL_Officer where Base_Camp_Id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			Double res= rs.getDouble("salary");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} 
		catch (IllegalArgumentException e) {
			return -1;
		}finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return getOfficersTotalSal;
	}
}
