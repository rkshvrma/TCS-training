package com.beans;

public class booking {

	private int bookingId;
	private String customerName;
	private int LicenseNo;
	private String vehicleMake;
	private int proposedDate;

	public booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public booking(int bookingId, String customerName, int licenseNo, String vehicleMake, int proposedDate) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		LicenseNo = licenseNo;
		this.vehicleMake = vehicleMake;
		this.proposedDate = proposedDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getLicenseNo() {
		return LicenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		LicenseNo = licenseNo;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public int getProposedDate() {
		return proposedDate;
	}

	public void setProposedDate(int proposedDate) {
		this.proposedDate = proposedDate;
	}

}
