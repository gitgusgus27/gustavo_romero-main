package com.gustavoromero.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Venta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_Vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_id_Vendedor"))
	private Vendedor vendedor;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_Cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_id_Cliente"))
	private Cliente cliente;
	
	
	@Column(name = "costo", nullable = false)
	private float costo;
	
	private LocalDateTime fecha_Venta;

	public Integer getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(Integer id_Venta) {
		this.id_Venta = id_Venta;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public LocalDateTime getFecha_Venta() {
		return fecha_Venta;
	}

	public void setFecha_Venta(LocalDateTime fecha_Venta) {
		this.fecha_Venta = fecha_Venta;
	}


	
    
}
