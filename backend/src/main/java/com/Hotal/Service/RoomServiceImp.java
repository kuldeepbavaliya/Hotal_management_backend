package com.Hotal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.Hotal.Model.Room;

public interface RoomServiceImp {
	
	String demo();
	
	String add(Room room);
	
	Page<Room> getall(int pno,int psize);
	
	String update(int id,Room room);
	
	String delete(int id);
	
	Optional<Room> getid(int id);
	
	List<Room> getdata();
}
