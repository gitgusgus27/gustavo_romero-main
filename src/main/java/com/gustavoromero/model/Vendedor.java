package com.gustavoromero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Vendedor;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;
	
	@Size(min = 3, message = "Nombre debe tener minimo 3 caracteres")
	@Column(name = "nombre_Vendedor", nullable = false, length = 70)
	private String nombre_Vendedor;
	
	@Size(min = 3, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "dir_Vendedor", nullable = false, length = 150)
	private String dir_Vendedor;

	public Integer getId_Vendedor() {
		return id_Vendedor;
	}

	public void setId_Vendedor(Integer id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombre_Vendedor() {
		return nombre_Vendedor;
	}

	public void setNombre_Vendedor(String nombre_Vendedor) {
		this.nombre_Vendedor = nombre_Vendedor;
	}

	public String getDir_Vendedor() {
		return dir_Vendedor;
	}

	public void setDir_Vendedor(String dir_Vendedor) {
		this.dir_Vendedor = dir_Vendedor;
	}
	

}
