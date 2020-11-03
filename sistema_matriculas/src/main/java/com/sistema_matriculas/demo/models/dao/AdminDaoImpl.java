package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.entity.Administrador;

@Repository
public class AdminDaoImpl implements IAdminDao{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Administrador> getAdministradores() {
		return em.createQuery("from Usuario").getResultList();
	}

	@Override
	@Transactional
	public void save(Administrador administrador) {
		if(administrador.getAdmin_id() != null && administrador.getAdmin_id() > 0) {
			em.merge(administrador);
		}
		else {
			em.persist(administrador);
		}
		//em.persist(alumno);
	}

	@Override
	public Administrador buscarAdmin(Long id) {
		return em.find(Administrador.class, id);
	}

	@Override
	public void eliminar(Long id) {
		Administrador usuario = buscarAdmin(id);
		em.remove(usuario);
		
	}

}
