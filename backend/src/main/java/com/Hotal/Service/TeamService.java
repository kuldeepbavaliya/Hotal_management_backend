package com.Hotal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Hotal.Model.Team;
import com.Hotal.Repository.TeamRepo;

@Service
public class TeamService implements TeamServiceImp{

	@Autowired
	TeamRepo teamrepo;


	@Override
	public String add(Team team) {
			
			team.setImage(team.getImage().split("fakepath")[1]);
			teamrepo.save(team);
		return "Sava Successfull !";
	}
	
	

	@Override
	public Page<Team> get(int pno,int psize) {
		PageRequest page=PageRequest.of(pno, psize);
		return teamrepo.findAll(page);
	}

	@Override
	public String update(int id,Team team) {
		teamrepo.findById(id).map(t->{
			t.setName(team.getName());
			t.setAge(team.getAge());
			t.setDepartment(team.getDepartment());
			t.setImage(team.getImage());
			
			return teamrepo.save(t);
		});
		return "Update Successfull";
	}

	@Override
	public String delete(int id) {
		teamrepo.deleteById(id);
		return "Delete Successfull";
	}

	@Override
	public List<Team> getall() {
	
		return teamrepo.findAll();
	}

	@Override
	public Optional<Team> getid(int id) {
		
		return teamrepo.findById(id);
	}

}
