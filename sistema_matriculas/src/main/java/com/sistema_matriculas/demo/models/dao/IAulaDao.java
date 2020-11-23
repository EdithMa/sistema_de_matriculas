package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Aula;

public interface IAulaDao {

	public List<Aula> getAulas();		
	public void save (Aula grado);		
	public Aula buscarGrado(Long id);
	public void eliminar(Long id);
}
