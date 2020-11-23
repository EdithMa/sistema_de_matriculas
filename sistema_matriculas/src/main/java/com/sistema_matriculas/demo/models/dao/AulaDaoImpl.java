package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.sistema_matriculas.demo.models.entity.Aula;

@Repository
public class AulaDaoImpl implements IAulaDao{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Aula> getAulas() {
		return em.createQuery("from Aula").getResultList();
	}

	@Override
	@Transactional
	public void save(Aula aula) {
		if(aula.getId() != null && aula.getId() >0) {
			em.merge(aula);
		}
		else {
			em.persist(aula);
		}
		//em.persist(grado);
	}

	@Override
	public Aula buscarGrado(Long id) {
		return em.find(Aula.class, id);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		Aula grado = buscarGrado(id);
		em.remove(grado);
	}


}
