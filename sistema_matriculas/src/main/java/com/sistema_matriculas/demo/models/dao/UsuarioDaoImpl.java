package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.entity.Alumno;

@Repository
public class UsuarioDaoImpl implements IAlumnoDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Alumno> getAlumnos() {		
		return em.createQuery("from Alumno").getResultList();
	}

	@Override
	@Transactional
	public void save(Alumno alumno) {
		if(alumno.getAlumno_id() != null && alumno.getAlumno_id()>0) {
			em.merge(alumno);
		}
		else {
			em.persist(alumno);
		}
		//em.persist(alumno);
	}

	@Override
	public Alumno buscarAlumno(Long id) {		
		return em.find(Alumno.class, id);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {		
		Alumno alumno = buscarAlumno(id);
		em.remove(alumno);
	}

	@Override
	public int existeAlumno(String email) {
		// TODO Auto-generated method stub
		return 0;
	}
}
