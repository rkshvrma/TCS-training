package com;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

class NavalMgmtDAOTest {


	NavalMgmt naval = new NavalMgmtDAO();
	
	public void testAddNavalOfficer()
	{
		
	int result = 0;
	NavalOfficer naval1 = new NavalOfficer(1800,"Harmeet Singh","Captain",42000,35);
	result = naval.addNavalOfficer(naval1);
	Assert.assertEquals(-2, result);

	NavalOfficer naval2 = null;
	result = naval.addNavalOfficer(naval2);
	Assert.assertEquals(-1, result);



	
}
	
	public void testAddBaseCamp()
	{
		int result = 0;
		BaseCamp basecamp1 = new BaseCamp(35,"INS Kalinga","BHOPAL");
		BaseCamp basecamp2 = new BaseCamp(36,"INS Dronacharya","UDAIPUR");
		 

		result = naval.addBaseCamp(basecamp1);
		Assert.assertEquals(-2, result);

		result = naval.addBaseCamp(basecamp2);
		Assert.assertEquals(-1, result);

		 
}
	
	@Test
	public void testGetOfficersNameSortedBySal() {
			
	}

	@Test
	public void testGetOfficersNameForBaseCampLoc() {
	fail("Not yet implemented");
	}

	@Test
	public void testGetOfficersTotalSalOnBaseCamp() {
	fail("Not yet implemented");
	}

	}
