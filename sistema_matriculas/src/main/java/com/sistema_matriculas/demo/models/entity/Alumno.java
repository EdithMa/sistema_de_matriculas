package com.sistema_matriculas.demo.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private String viveCon;
	private String numeroHermanos;
	private String colegioProcedencia;
	private String direccion;
	private String dni;
	private String genero;
	private String telefono;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechanac;
	private static final long serialVersionUID = 1L;
	
	//Relacion entre Alumno - usuario
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "alumno")
	private Usuario usuario;

	//Relacion entre Alumno - Matrícula
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name= "alumno_id")
	private List<Matricula> matricula;
	


	public Alumno() {
		this.matricula = new ArrayList<Matricula>();
	}
	

	public Alumno(Long alumno_id, String nombre, String apellido, String viveCon, String dni, String genero,
			String telefono, String email, String numeroHermanos, String colegioProcedencia, String direccion,
			Date fechanac, Usuario usuario, List<Matricula> matricula) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.viveCon = viveCon;
		this.dni = dni;
		this.genero = genero;
		this.telefono = telefono;
		this.email = email;
		this.numeroHermanos = numeroHermanos;
		this.colegioProcedencia = colegioProcedencia;
		this.direccion = direccion;
		this.fechanac = fechanac;
		this.usuario = usuario;
		this.matricula = matricula;
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
	public Date getFechanac() {
		return fechanac;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}
	public String getViveCon() {
		return viveCon;
	}
	public void setViveCon(String viveCon) {
		this.viveCon = viveCon;
	}

	public List<Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(List<Matricula> matricula) {
		this.matricula = matricula;
	}

	public void addMatricula(Matricula matricula) {
		this.matricula.add(matricula);
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
