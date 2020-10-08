package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Alumno;

public interface IAlumnoDao {

		public List<Alumno> getAlumnos();
		public void save (Alumno alumno);
		public Alumno buscarAlumno(Long id);
		public void eliminar(Long id);
}
