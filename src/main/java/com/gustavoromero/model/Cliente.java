package com.gustavoromero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Cliente;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombre_Cliente", nullable = false, length = 70)
	private String nombre_Cliente;
	
	@Size(min = 3, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion_Cliente", nullable = false, length = 150)
	private String dir_Cliente;
	
	@Size(min = 9, message = "telefono debe tener minimo 9 caracteres")
	@Column(name = "tel_Cliente", nullable = false, length = 9)
	private String tel_Cliente;

	
	
	public Integer getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNombre_Cliente() {
		return nombre_Cliente;
	}

	public void setNombre_Cliente(String nombre_Cliente) {
		this.nombre_Cliente = nombre_Cliente;
	}

	public String getDir_Cliente() {
		return dir_Cliente;
	}

	public void setDir_Cliente(String dir_Cliente) {
		this.dir_Cliente = dir_Cliente;
	}

	public String getTel_Cliente() {
		return tel_Cliente;
	}

	public void setTel_Cliente(String tel_Cliente) {
		this.tel_Cliente = tel_Cliente;
	}
	
	

}
