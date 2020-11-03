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
@Table(name="matriculas")
public class Matricula implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	
	//Relacion entre matricula y AnioLectivo 
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "aniolectivo_id")
	private AnioLectivo lectivos;
	
	//Relacion entre Matricula y Grado 
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "grado_id")
	private Grado grado;

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Matricula(Long id) {
		super();
		this.id = id;
	}	





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
