package com.Hotal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotal.Model.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {

}
