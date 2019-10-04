package com.dao;
 
import com.beans.tourPlan;

public interface TourData {
	
	public int createTourPlan(tourPlan tour);
	public tourPlan searchForTourPlan();
	public String subscribeTourPackage();
	public String cancelSubscribtion();
	

}
