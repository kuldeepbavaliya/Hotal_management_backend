package com.Hotal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotal.Model.Booking;
import com.Hotal.Service.BookingService;

@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookingController {

	@Autowired
	BookingService bookingservice;
	
	@GetMapping("/get")
	public List<Booking> getall()
	{
		return bookingservice.getall();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Booking booking)
	{
		return bookingservice.add(booking);
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody Booking booking)
	{
		return bookingservice.update(id,booking);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return bookingservice.delete(id);
	}
}
