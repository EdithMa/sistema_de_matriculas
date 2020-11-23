package com.sistema_matriculas.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema_matriculas.demo.models.dao.IAulaDao;
import com.sistema_matriculas.demo.models.entity.Aula;

@Controller
public class AulaController {

	@Autowired
	private IAulaDao auladao;
	
	@RequestMapping("aula/listaAulas")
	public String listar(Model model) {
		model.addAttribute("grados", auladao.getAulas());
		return "aula/listaAulas";
	}
	
	@RequestMapping("/formAula")
	public String crear(Map<String, Object> model) {
		Aula grado = new Aula();
		model.put("titulo", "Registrar Grado");
		model.put("guardarGrado", "Registrar");
		model.put("grado", grado);
		return "aula/formAula";
	}
	
	@RequestMapping(value = "/formAula", method = RequestMethod.POST)
	public String guardar(Aula grado) {
		auladao.save(grado);
		return "redirect:/aula/listaAulas";
	}
	
	@RequestMapping("/formAula/{id}")
	public String editar(@PathVariable(value = "id") Long id, Model model) {
		Aula grado = null;
		if(id > 0) {
			grado = auladao.buscarGrado(id);
		}
		else {
			System.out.println("No existe aula con ese id");
		}
		model.addAttribute("titulo", "Editar Grado");
		model.addAttribute("guardarGrado", "Actualizar");
		model.addAttribute("grado", grado);
		return "aula/formAula";
	}
	
	@RequestMapping("/eliminarGrado/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		if(id > 0) {
			auladao.eliminar(id);
		}
		return "redirect:/aula/listaAulas";
	}
}
