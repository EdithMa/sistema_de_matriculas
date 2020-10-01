package com.sistema_matriculas.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int usuario_id;
		private String nombre;
		private String apellido;
		private String email;
		public int getUsuario_id() {
			return usuario_id;
		}
		
		public void setUsuario_id(int usuario_id) {
			this.usuario_id = usuario_id;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Usuario(int usuario_id, String nombre, String apellido, String email) {
			
			this.usuario_id = usuario_id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
		}
		public Usuario() {
			
		}
		
		
}
