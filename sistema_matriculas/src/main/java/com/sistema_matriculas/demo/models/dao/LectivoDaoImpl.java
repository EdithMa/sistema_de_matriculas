
package com.sistema_matriculas.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sistema_matriculas.demo.models.entity.Alumno;
import com.sistema_matriculas.demo.models.entity.AnioLectivo;

@Repository
public class LectivoDaoImpl implements ILectivoDAO{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AnioLectivo> getAnioLectivos() {
		return em.createQuery("from AnioLectivo").getResultList();
	}

	@Override
	@Transactional
	public void save(AnioLectivo anioLectivo) {
		if(anioLectivo.getId() != null && anioLectivo.getId()>0) {
			em.merge(anioLectivo);
		}
		else {
			em.persist(anioLectivo);
		}
	}

	@Override	
	public AnioLectivo buscarAnioLectivo(Long id) {
		return em.find(AnioLectivo.class, id);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		AnioLectivo anioLectivo = buscarAnioLectivo(id);
		em.remove(anioLectivo);
	}

	@Override
	public int existeAnioLectivo(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

}
