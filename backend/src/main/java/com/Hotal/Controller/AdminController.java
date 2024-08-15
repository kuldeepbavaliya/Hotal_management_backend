package com.Hotal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotal.Model.Admin;
import com.Hotal.Service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@GetMapping("/info")
	public String get()
	{
		return adminservice.getinfo();
	}
	
	
	@PostMapping("/add")
	public String add(@RequestBody Admin admin)
	{
			return adminservice.add(admin);
	}
	
	
	@GetMapping("/get")
	public List<Admin> getall()
	{
		return adminservice.get();
	}
	
	
}
