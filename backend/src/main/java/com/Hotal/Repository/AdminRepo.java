package com.Hotal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotal.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String>{

}
