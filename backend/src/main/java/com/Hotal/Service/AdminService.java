package com.Hotal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotal.Model.Admin;
import com.Hotal.Repository.AdminRepo;

@Service
public class AdminService implements AdminServiceImp{

	@Autowired
	AdminRepo adminrepo;
	
	@Override
	public String getinfo() {
		
		return "Radhe Krishna";
	}

	@Override
	public String add(Admin admin) {
		adminrepo.save(admin);
		return "Save Successful !";
	}

	@Override
	public List<Admin> get() {
		
		return adminrepo.findAll();
	}
	
}
