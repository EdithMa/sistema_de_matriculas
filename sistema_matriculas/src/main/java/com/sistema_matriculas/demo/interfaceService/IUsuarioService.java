package com.sistema_matriculas.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sistema_matriculas.demo.models.Usuario;


public interface IUsuarioService {
	public List<Usuario> listar();
	public Optional<Usuario> listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
	
}
