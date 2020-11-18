package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Grado;

public interface IGradoDao {

	public List<Grado> getGrados();		
	public void save (Grado grado);		
	public Grado buscarGrado(Long id);
	public void eliminar(Long id);
}
