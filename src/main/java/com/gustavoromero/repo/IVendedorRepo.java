package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Vendedor;

public interface IVendedorRepo extends JpaRepository<Vendedor, Integer> {

}
