package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer> {

}
