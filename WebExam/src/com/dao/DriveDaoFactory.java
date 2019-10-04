package com.dao;

import com.dao.TestDrive;

public class DriveDaoFactory {
	private static DriveDaoFactory instance = null;

	private DriveDaoFactory() {
	}

	public static DriveDaoFactory getInstance() {
		if (instance == null) {
			instance = new DriveDaoFactory();
		}

		return instance;
	}

	public TestDrive getDriveDataCollection(String type) {
		TestDrive testDrive = null;

		if (type.equals("Oracle")) {
			testDrive = new DriveDataOracle();
		}

		return testDrive;
	}

}
