package com.sistema_matriculas.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{
	
}
