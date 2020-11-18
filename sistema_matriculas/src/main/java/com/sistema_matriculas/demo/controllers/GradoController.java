package com.sistema_matriculas.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema_matriculas.demo.models.dao.IGradoDao;
import com.sistema_matriculas.demo.models.entity.Grado;

@Controller
public class GradoController {

	@Autowired
	private IGradoDao gradodao;
	
	@RequestMapping("/listaGrados")
	public String listar(Model model) {
		model.addAttribute("grados", gradodao.getGrados());
		return "grado/listaGrados";
	}
	
	@RequestMapping("/formGrado")
	public String crear(Map<String, Object> model) {
		Grado grado = new Grado();
		model.put("titulo", "Registrar Grado");
		model.put("guardarGrado", "Registrar");
		model.put("grado", grado);
		return "grado/formGrado";
	}
	
	@RequestMapping(value = "/formGrado", method = RequestMethod.POST)
	public String guardar(Grado grado) {
		gradodao.save(grado);
		return "redirect:/listaGrados";
	}
	
	@RequestMapping("/formGrado/{id}")
	public String editar(@PathVariable(value = "id") Long id, Model model) {
		Grado grado = null;
		if(id > 0) {
			grado = gradodao.buscarGrado(id);
		}
		else {
			System.out.println("No existe grado con ese id");
		}
		model.addAttribute("titulo", "Editar Grado");
		model.addAttribute("guardarGrado", "Actualizar");
		model.addAttribute("grado", grado);
		return "grado/formGrado";
	}
	
	@RequestMapping("/eliminarGrado/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		if(id > 0) {
			gradodao.eliminar(id);
		}
		return "redirect:/listaGrados";
	}
}
