package com.beans;

import java.sql.Date;

public class Employee {

	private int employeeId;
	private String password;
	private int hid;
	private String employeeName;
	private Date employeeDob;
	private String employeeGender;
	private String employeeEmail;
	private String employeeAltEmail;
	private String employeePhone;
	private String employeeAltPhone;
	private int policyId;
	private String employeeBankAccount;
	private String employeeBankName;
	private String employeeIFSC;
	
	
	
	public Employee(int employeeId, String employeeName, Date employeeDob, String employeeGender, String employeeEmail,
			String employeeAltEmail, String employeePhone, String employeeAltPhone, int policyId,
			String employeeBankAccount, String employeeBankName, String employeeIFSC) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDob = employeeDob;
		this.employeeGender = employeeGender;
		this.employeeEmail = employeeEmail;
		this.employeeAltEmail = employeeAltEmail;
		this.employeePhone = employeePhone;
		this.employeeAltPhone = employeeAltPhone;
		this.policyId = policyId;
		this.employeeBankAccount = employeeBankAccount;
		this.employeeBankName = employeeBankName;
		this.employeeIFSC = employeeIFSC;
	}

	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAltEmail() {
		return employeeAltEmail;
	}

	public void setEmployeeAltEmail(String employeeAltEmail) {
		this.employeeAltEmail = employeeAltEmail;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeAltPhone() {
		return employeeAltPhone;
	}

	public void setEmployeeAltPhone(String employeeAltPhone) {
		this.employeeAltPhone = employeeAltPhone;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getEmployeeBankAccount() {
		return employeeBankAccount;
	}

	public void setEmployeeBankAccount(String employeeBankAccount) {
		this.employeeBankAccount = employeeBankAccount;
	}

	public String getEmployeeBankName() {
		return employeeBankName;
	}

	public void setEmployeeBankName(String employeeBankName) {
		this.employeeBankName = employeeBankName;
	}

	public String getEmployeeIFSC() {
		return employeeIFSC;
	}

	public void setEmployeeIFSC(String employeeIFSC) {
		this.employeeIFSC = employeeIFSC;
	}
	
	
}