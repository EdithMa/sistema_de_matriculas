package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_comprobantes")
public class TipoComprobante implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	

	public TipoComprobante(Long id) {
		super();
		this.id = id;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
