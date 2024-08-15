package com.Hotal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotal.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
