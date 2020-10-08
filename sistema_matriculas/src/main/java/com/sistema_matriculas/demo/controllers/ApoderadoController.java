package com.sistema_matriculas.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema_matriculas.demo.models.dao.IApoderadoDAO;
import com.sistema_matriculas.demo.models.entity.Apoderado;



@Controller
public class ApoderadoController {
	
	@Autowired
	private IApoderadoDAO apoderadoDAO;
	
	@RequestMapping("/listaApoderados")
	public String listar(Model model) {
		model.addAttribute("apoderados",apoderadoDAO.getApoderados());
		return "listaApoderados";
	}
	
	@RequestMapping("/formApoderados")
	public String crear(Map<String, Object> model) {
		Apoderado apoderado = new Apoderado();
		model.put("titulo", "Registrar datos del Apoderado");
		model.put("nombreboton", "Registrarse");
		model.put("apoderado", apoderado);
		return "formApoderados";
	}
	
	@RequestMapping(value = "/formApoderados", method = RequestMethod.POST)
	public String guardar (Apoderado apoderado) {
		apoderadoDAO.save(apoderado);
		return "redirect:formApoderados";
	}
	
	@RequestMapping("/formApoderados/{id}")
	public String editar(@PathVariable(value="id") Long id, Model model) {
		Apoderado apoderado = null;
		if(id>0) {
			apoderado = apoderadoDAO.buscarApoderado(id);
		}else {
			return "redirect:/listaApoderados";
		}
		model.addAttribute("titulo","Modificar datos del apoderado");
		model.addAttribute("apoderado",apoderado);
		model.addAttribute("nombreboton", "Actualizar datos");
		return "formApoderados";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		if(id>0) {
			apoderadoDAO.eliminar(id);
		}
		return "redirect:/listaApoderados";
	}
}

