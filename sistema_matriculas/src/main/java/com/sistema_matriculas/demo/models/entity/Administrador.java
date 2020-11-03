package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long admin_id;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "administrador")
	private Usuario usuario;

	public Administrador() {
		
	}

	public Administrador(Long admin_id, String nombre, String apellidos, String email, String password) {
		super();
		this.admin_id = admin_id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
	}



	public Long getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}

	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellidos() {
		return apellidos;
	}





	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
}
