package com.dao;

 

public class EmployeeDAOFactory {
	
 

		private static EmployeeDAOFactory instance = null;
		private EmployeeDAOFactory() {}
		
		public static EmployeeDAOFactory getInstance() {
			if (instance == null) {
				instance = new EmployeeDAOFactory();
			}
			
			return instance;
		}
		
		public EmployeeDataOracle getEmployeeDataCollection(String type) {
			EmployeeDataOracle EmpData = null;
			
			
			if (type.equals("Oracle")) {
				EmpData = new EmployeeDataOracle();
			}  
			 
			
			return EmpData;
		}
		
	}
 
