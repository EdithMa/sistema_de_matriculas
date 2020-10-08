package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="alumnos")
public class Alumno implements Serializable{		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long alumno_id;
	private String nombre;
	private String apellido;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechanac;
	private String email;
	private String numeroHermanos;
	private String colegioProcedencia;
	private String observaciones;
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	private static final long serialVersionUID = 1L;
	
	@PrePersist
	public void inicializar() {
		fechaCreacion = new Date();
	}
	
	public void fechanac() {
		fechanac = new Date();
	}	
	
	public Alumno() {
		
	}
	public Alumno(Long alumno_id, String nombre, String apellido, Date fechanac, String email, String numeroHermanos,
			String colegioProcedencia, String observaciones, Date fechaCreacion) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.email = email;
		this.numeroHermanos = numeroHermanos;
		this.colegioProcedencia = colegioProcedencia;
		this.observaciones = observaciones;
		this.fechaCreacion = fechaCreacion;
	}
	public Long getAlumno_id() {
		return alumno_id;
	}
	public void setAlumno_id(Long alumno_id) {
		this.alumno_id = alumno_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumeroHermanos() {
		return numeroHermanos;
	}
	public void setNumeroHermanos(String numeroHermanos) {
		this.numeroHermanos = numeroHermanos;
	}
	public String getColegioProcedencia() {
		return colegioProcedencia;
	}
	public void setColegioProcedencia(String colegioProcedencia) {
		this.colegioProcedencia = colegioProcedencia;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFechanac() {
		return fechanac;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}
	
	
}
