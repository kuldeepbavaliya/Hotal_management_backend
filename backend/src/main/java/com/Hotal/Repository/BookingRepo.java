package com.Hotal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotal.Model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
