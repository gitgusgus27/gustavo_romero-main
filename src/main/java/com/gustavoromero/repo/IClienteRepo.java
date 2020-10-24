package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
