package com.Hotal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotal.Model.Room;
import com.Hotal.Service.RoomService;

@RestController
@RequestMapping("/room")
@CrossOrigin
public class RoomContoller {
	
	@Autowired
	RoomService rooms;
	
	@GetMapping("/get")
	public List<Room> getdata()
	{
		return rooms.getdata();
	}
	
	@GetMapping("/demo")
	public String demo()
	{
		return rooms.demo();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Room room)
	{
		return rooms.add(room);
	}
	
	@GetMapping("/get/{pno}/{psize}")
	public Page<Room> get(@PathVariable int pno,@PathVariable int psize)
	{
		return rooms.getall(pno,psize);
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody Room room)
	{
		return rooms.update(id,room);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delte(@PathVariable int id)
	{
		return rooms.delete(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Room> getid(@PathVariable int id)
	{
		return rooms.getid(id);
	}
	
}
