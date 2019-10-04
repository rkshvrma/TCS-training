package com;

public class NavalOfficer {

	private int officerNo;
	private String officerName;
	private String officerRank;
	private double officerSal;
	private int baseCampId;

	public NavalOfficer() {
		super();
	}

	public NavalOfficer(int officerNo, String officerName, String officerRank, double officerSal, int baseCampId) {
		super();
		this.officerNo = officerNo;
		this.officerName = officerName;
		this.officerRank = officerRank;
		this.officerSal = officerSal;
		this.baseCampId = baseCampId;
	}

	public int getOfficerNo() {
		return officerNo;
	}

	public void setOfficerNo(int officerNo) {
		this.officerNo = officerNo;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerRank() {
		return officerRank;
	}

	public void setOfficerRank(String officerRank) {
		this.officerRank = officerRank;
	}

	public double getOfficerSal() {
		return officerSal;
	}

	public void setOfficerSal(double officerSal) {
		this.officerSal = officerSal;
	}

	public int getBaseCampId() {
		return baseCampId;
	}

	public void setBaseCampId(int baseCampId) {
		this.baseCampId = baseCampId;
	}

}
