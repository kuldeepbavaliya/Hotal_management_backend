package com.Hotal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.Hotal.Model.Team;

public interface TeamServiceImp{
	
	Optional<Team> getid(int id);
	
	String add(Team team);
	
	String update(int id,Team team);
	
	String delete(int id);
	
	Page<Team> get(int pno,int psize);
	
	List<Team> getall();
}
