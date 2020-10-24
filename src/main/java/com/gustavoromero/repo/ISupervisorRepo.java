package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Supervisor;

public interface ISupervisorRepo extends JpaRepository<Supervisor, Integer>{

}
