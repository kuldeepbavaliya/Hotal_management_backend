package com.Hotal.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Hotal.Model.Customer;


public interface CustomerServiceImp {
	
	String show();
	
	Page<Customer> getall(int pno,int psize);
	
	String add(Customer customer);
	
	String update(int id,Customer customer);
	
	String delete(int id);
	
	Customer getid(int id);
	
	List<Customer> getinfo();
}
