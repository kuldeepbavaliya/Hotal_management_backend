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

import com.Hotal.Model.Team;
import com.Hotal.Service.TeamService;

@RestController
@CrossOrigin
@RequestMapping("/team")
public class TeamController {

		@Autowired
		TeamService teamservice;
	
		@GetMapping("/get/{id}")
		public Optional<Team> getid(@PathVariable int id)
		{
			return teamservice.getid(id);
		}
		
		@PostMapping("/add")
		public String add(@RequestBody Team team)
		{
			return teamservice.add(team);
		}
		
		@GetMapping("/get/{pno}/{psize}")
		public Page<Team> get(@PathVariable int pno,@PathVariable int psize)
		{
			return teamservice.get(pno,psize);
		}
		
		@GetMapping("/get")
		public List<Team> getdata()
		{
			return teamservice.getall();
		}
		
		@PutMapping("/update/{id}")
		public String update(@PathVariable int id,@RequestBody Team team )
		{
			return teamservice.update(id,team);
		}
		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable int id)
		{
			return teamservice.delete(id);
		}
}
