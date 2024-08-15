package com.Hotal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Hotal.Model.Room;
import com.Hotal.Repository.RoomRepo;

@Service
public class RoomService  implements RoomServiceImp{

	@Autowired
	RoomRepo roomrepo;
	
	@Override
	public String demo() {
		
		return "Radhe Krishna";
	}

	@Override
	public String add(Room room) {
		room.setImage(room.getImage().split("fakepath")[1]);
		roomrepo.save(room);
		return "Sava Successfully";
	}

	@Override
	public Page<Room> getall(int pno,int psize) {
		PageRequest page=PageRequest.of(pno, psize);
		return roomrepo.findAll(page);
	}


	@Override
	public String delete(int id) {
		roomrepo.deleteById(id);
		return "Delete Successfully ";
	}

	@Override
	public String update(int id, Room room) {
		roomrepo.findById(id).map(r->{
			r.setName(room.getName());
			r.setCity(room.getCity());
			r.setPayment(room.getPayment());
			r.setDecrip(room.getDecrip());
			return roomrepo.save(r);
		});
		return "Update SuccessFully";
	}

	@Override
	public Optional<Room> getid(int id) {
		
		return roomrepo.findById(id);
	}

	@Override
	public List<Room> getdata() {
		
		return roomrepo.findAll();
	}
	

}
