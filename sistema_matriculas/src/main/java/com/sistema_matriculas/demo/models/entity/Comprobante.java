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
@Table(name="comprobantes")
public class Comprobante implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Relacion entre Comprobante - TipoComprobante 
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "tipocomprobante_id")
	private TipoComprobante tipos;
	
	//Relacion entre Comprobante - DetalleComprobante
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "detallecomprobante_id")
	private DetalleComprobante detalles;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Comprobante(Long id) {
		super();
		this.id = id;
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
