package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Matricula;

public interface IMatriculaDao {

	public List<Matricula> getMatriculas();
	public void save (Matricula matricula);		
	public Matricula buscarMatricula(Long id);
	public void eliminar(Long id);
}
