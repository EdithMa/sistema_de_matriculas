package com.sistema_matriculas.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_matriculas.demo.interfaceService.IUsuarioService;
import com.sistema_matriculas.demo.interfaces.IUsuario;
import com.sistema_matriculas.demo.models.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
