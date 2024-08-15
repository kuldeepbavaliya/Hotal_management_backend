package com.Hotal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotal.Model.Booking;
import com.Hotal.Repository.BookingRepo;

@Service
public class BookingService implements BookingServiceImp{
	
	@Autowired
	BookingRepo bookingrepo;

	@Override
	public List<Booking> getall() {
		
		return bookingrepo.findAll();
	}

	@Override
	public String add(Booking booking) {
		bookingrepo.save(booking);
		return "Save Successfull";
	}

	@Override
	public String update(int id, Booking booking) {
		bookingrepo.findById(id).map(b->{
			b.setCity(booking.getCity());
			b.setEmail(booking.getEmail());
			b.setImage(booking.getImage());
			b.setName(booking.getName());
			b.setPassword(booking.getPassword());
			b.setPayment(booking.getPayment());
			b.setPeople(booking.getPeople());
			return bookingrepo.save(b);
		});
		return "Update Successfull";
	}

	@Override
	public String delete(int id) {
			bookingrepo.deleteById(id);
		return "Delete Successfull";
	}
	
	
}
