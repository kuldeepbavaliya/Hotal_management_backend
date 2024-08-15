package com.Hotal.Controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Hotal.Model.Customer;
import com.Hotal.Service.CustomerService;

import jakarta.annotation.security.PermitAll;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustmerController {

	@Autowired
	CustomerService cs;
	
		@GetMapping("/show")
		public String show()
		{
			return cs.show();
		}
		
		@GetMapping("/get/{pno}/{psize}")
		public Page<Customer> get(@PathVariable int pno,@PathVariable int psize)
		{
			
			return cs.getall(pno,psize);
		}
		
		@PostMapping("/add")
		public String add(@RequestBody Customer customer)
		{
			return cs.add(customer);
		}
		
		@PutMapping("/update/{id}")
		public String update(@ PathVariable int id,@RequestBody Customer customer)
		{
			return cs.update(id,customer);
		}
		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable int id)
		{
			return cs.delete(id);
		}
		
		@GetMapping("/get/{id}")
		public Customer getid(@PathVariable int id)
		{
			return cs.getid(id);
		}
		
		@GetMapping("/get")
		public List<Customer> getinfo()
		{
			return cs.getinfo();
		}
}
