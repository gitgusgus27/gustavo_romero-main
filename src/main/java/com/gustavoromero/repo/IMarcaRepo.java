package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Marca;

public interface IMarcaRepo extends JpaRepository<Marca, Integer> {

}
