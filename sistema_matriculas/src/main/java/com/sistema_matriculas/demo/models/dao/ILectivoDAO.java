package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.AnioLectivo;

public interface ILectivoDAO {

	public List<AnioLectivo> getAnioLectivos();		
	public void save (AnioLectivo anioLectivo);		
	public AnioLectivo buscarAnioLectivo(Long id);
	public void eliminar(Long id);
	public abstract int existeAnioLectivo(String email);
}
