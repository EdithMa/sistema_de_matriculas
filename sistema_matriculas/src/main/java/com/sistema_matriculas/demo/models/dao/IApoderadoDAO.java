package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Apoderado;



public interface IApoderadoDAO {
	public List<Apoderado> getApoderados();
	public void save(Apoderado apoderado);
	public Apoderado buscarApoderado(Long id);
	public void eliminar(Long id);
	public abstract int existeApod(String email);
	public abstract boolean validarApod(Apoderado apod);
}
