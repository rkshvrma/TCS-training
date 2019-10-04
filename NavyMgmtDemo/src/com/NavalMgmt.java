package com;

import java.util.ArrayList;

public interface NavalMgmt {

	
	int addNavalOfficer(NavalOfficer navalOfficer) ;
	int addBaseCamp(BaseCamp baseCamp);
	ArrayList<String> getOfficersNameSortedBySal();
	ArrayList<String> getOfficersNameForBaseCampLoc(String baseCampLoc);
	double getOfficersTotalSalOnBaseCamp(int baseCampId);
	
}
