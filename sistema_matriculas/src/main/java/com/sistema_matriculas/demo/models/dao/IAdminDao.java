package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import com.sistema_matriculas.demo.models.entity.Administrador;


public interface IAdminDao {

	public List<Administrador> getAdministradores();
	public void save (Administrador administrador);
	public Administrador buscarAdmin(Long id);
	public void eliminar(Long id);
}
