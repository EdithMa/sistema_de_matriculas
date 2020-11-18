package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "grados")
public class Grado implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	private String secciones;
	private String tipo;
	
	//Relacion entre Grado - Seccion
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "seccion_id")
	private Seccion seccion;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}		
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSecciones() {
		return secciones;
	}	
	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}				
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Grado(Long id, String descripcion, String secciones, String tipo) {
		this.id = id;
		this.descripcion = descripcion;
		this.secciones = secciones;
		this.tipo = tipo;
	}

	public Grado() {
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
