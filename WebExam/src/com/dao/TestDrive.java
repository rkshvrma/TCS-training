package com.dao;

import java.util.List;

import com.beans.booking;

public interface TestDrive {

	public boolean testDriveBooking(booking book);

	public List<booking> viewBookings(int date);

	public int cancelBooking(int bookingId);

}
