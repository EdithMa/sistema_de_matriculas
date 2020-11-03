package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.entity.Alumno;
import com.sistema_matriculas.demo.models.entity.Matricula;

@Repository
public class MatriculaDaoImpl implements IMatriculaDao{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Matricula> getMatriculas() {
		return em.createQuery("from Matricula").getResultList();
	}

	@Override
	@Transactional
	public void save(Matricula matricula) {
		if(matricula.getId() != null && matricula.getId() > 0) {
			em.merge(matricula);
		}
		else {
			em.persist(matricula);
		}
	}

	@Override
	public Matricula buscarMatricula(Long id) {
		return em.find(Matricula.class, id);
	}

	@Override
	public void eliminar(Long id) {
		Matricula matricula = buscarMatricula(id);
		em.remove(matricula);
	}

}
