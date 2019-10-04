package com.beans;

public class tourPlan {
	
	
	private int tour_id;
	private String tour_name;
	private String starting_location;
	private String places_included;
	private Double tour_cost;
	private Double Discount_per;
	private int tour_days;
	
	
	public tourPlan(int tour_id, String tour_name, String starting_location, String places_included, Double tour_cost,
			Double discount_per, int tour_days) {
		super();
		this.tour_id = tour_id;
		this.tour_name = tour_name;
		this.starting_location = starting_location;
		this.places_included = places_included;
		this.tour_cost = tour_cost;
		Discount_per = discount_per;
		this.tour_days = tour_days;
	}


	public tourPlan() {
		super();
	}


	public int getTour_id() {
		return tour_id;
	}


	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}


	public String getTour_name() {
		return tour_name;
	}


	public void setTour_name(String tour_name) {
		this.tour_name = tour_name;
	}


	public String getStarting_location() {
		return starting_location;
	}


	public void setStarting_location(String starting_location) {
		this.starting_location = starting_location;
	}


	public String getPlaces_included() {
		return places_included;
	}


	public void setPlaces_included(String places_included) {
		this.places_included = places_included;
	}


	public Double getTour_cost() {
		return tour_cost;
	}


	public void setTour_cost(Double tour_cost) {
		this.tour_cost = tour_cost;
	}


	public Double getDiscount_per() {
		return Discount_per;
	}


	public void setDiscount_per(Double discount_per) {
		Discount_per = discount_per;
	}


	public int getTour_days() {
		return tour_days;
	}


	public void setTour_days(int tour_days) {
		this.tour_days = tour_days;
	}


	@Override
	public String toString() {
		return "tourPlan [tour_id=" + tour_id + ", tour_name=" + tour_name + ", starting_location=" + starting_location
				+ ", places_included=" + places_included + ", tour_cost=" + tour_cost + ", Discount_per=" + Discount_per
				+ ", tour_days=" + tour_days + "]";
	}

	
	
	
}
