package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.entity.Apoderado;



@Repository
public class ApoderadoDAOImpl implements IApoderadoDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Apoderado> getApoderados() {
		return em.createQuery("from Apoderado").getResultList();
	
	}

	@Override
	@Transactional
	public void save(Apoderado apoderado) {
		if (apoderado.getId()!=null && apoderado.getId()>0 ) {
			//modificar
			em.merge(apoderado);
		}else {
			//guardar nuevo
			em.persist(apoderado);
		}
	}

	@Override
	public Apoderado buscarApoderado(Long id) {
		return em.find(Apoderado.class,id);
	}
	
	@Override
	@Transactional
	public void eliminar (Long id) {
		Apoderado apoderado = buscarApoderado(id);
		em.remove(apoderado);
	}
}
