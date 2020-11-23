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
public class Aula implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String grado;
	private String secciones;
	private String nivel;
	private int capacidad;
	
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
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getSecciones() {
		return secciones;
	}	
	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}					
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Aula(Long id, String grado, String secciones, String nivel, int capacidad, Seccion seccion) {
		this.id = id;
		this.grado = grado;
		this.secciones = secciones;
		this.nivel = nivel;
		this.capacidad = capacidad;
		this.seccion = seccion;
	}
	public Aula() {
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
