package com.gustavoromero.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Producto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_id_Marca"))
	private Marca marca;
	
	@Size(min = 3, message = "Descripcion debe tener minimo 3 caracteres")
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;
	

	@Column(name = "valor_Producto", nullable = false)
	private float valor_Producto;
	
	@Size(min = 2, message = "Nombre debe tener minimo 2 caracteres")
	@Column(name = "nombre_Producto", nullable = false, length = 70)
	private String nombre_Producto;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "compra_producto", joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "id_producto"), inverseJoinColumns = @JoinColumn(name = "id_Venta", referencedColumnName = "id_Venta"))
	private List<Venta> ventas;

	public Integer getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getValor_Producto() {
		return valor_Producto;
	}

	public void setValor_Producto(float valor_Producto) {
		this.valor_Producto = valor_Producto;
	}

	public String getNombre_Producto() {
		return nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	


	
    

}
