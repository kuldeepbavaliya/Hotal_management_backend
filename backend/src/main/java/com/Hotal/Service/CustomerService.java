package com.Hotal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.Hotal.Error.Notfound;
import com.Hotal.Model.Customer;
import com.Hotal.Repository.CustomerRepo;

@Service
public class CustomerService implements CustomerServiceImp{

	@Autowired
	CustomerRepo cr;
	
	@Override
	public String show() {
		
		return "Radhe Krishna";
	}

	@Override
	public Page<Customer> getall(int pno,int psize) {
		PageRequest pageble=PageRequest.of(pno, psize);
		return cr.findAll(pageble);
	}

	@Override
	public String add(Customer customer) {
		
		cr.save(customer);
		
		return "Save Successfull";
	}

	@Override
	public String delete(int id) {
		cr.deleteById(id);
		return "Delete SuccessFull";
	}

	@Override
	public String update( int id,Customer customer) {
			cr.findById(id).map(cst->{
				cst.setEmail(customer.getEmail());
				cst.setPassword(customer.getPassword());
				return cr.save(cst);
			}).orElseThrow(()->new Notfound(id));
		return "Update Successfully";
	}

	@Override
	public Customer getid(int id) {
		
		return cr.findById(id).orElseThrow(()->new Notfound(id));
	}

	@Override
	public List<Customer> getinfo() {
		
		return cr.findAll();
	}
	
	
	
}
