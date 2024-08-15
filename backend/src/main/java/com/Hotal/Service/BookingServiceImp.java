package com.Hotal.Service;

import java.util.List;

import com.Hotal.Model.Booking;

public interface BookingServiceImp {

	List<Booking> getall();
	
	String add(Booking booking);
	
	String update(int id,Booking booking);
	
	String delete(int id);
}
