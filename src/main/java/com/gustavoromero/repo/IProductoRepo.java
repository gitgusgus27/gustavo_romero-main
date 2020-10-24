package com.gustavoromero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoromero.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
