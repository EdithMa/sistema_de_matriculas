package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "anio_lectivo")
public class AnioLectivo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String anio_inicio;
	private String anio_fin;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAnio_inicio() {
		return anio_inicio;
	}


	public void setAnio_inicio(String anio_inicio) {
		this.anio_inicio = anio_inicio;
	}


	public String getAnio_fin() {
		return anio_fin;
	}


	public void setAnio_fin(String anio_fin) {
		this.anio_fin = anio_fin;
	}

	

	public AnioLectivo(Long id, String anio_inicio, String anio_fin) {
		super();
		this.id = id;
		this.anio_inicio = anio_inicio;
		this.anio_fin = anio_fin;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
