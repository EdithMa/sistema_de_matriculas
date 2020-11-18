package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.sistema_matriculas.demo.models.entity.Grado;

@Repository
public class GradoDaoImpl implements IGradoDao{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Grado> getGrados() {
		return em.createQuery("from Grado").getResultList();
	}

	@Override
	@Transactional
	public void save(Grado grado) {
		if(grado.getId() != null && grado.getId() >0) {
			em.merge(grado);
		}
		else {
			em.persist(grado);
		}
		//em.persist(grado);
	}

	@Override
	public Grado buscarGrado(Long id) {
		return em.find(Grado.class, id);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		Grado grado = buscarGrado(id);
		em.remove(grado);
	}


}
