package com.sistema_matriculas.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema_matriculas.demo.models.dao.IAlumnoDao;
import com.sistema_matriculas.demo.models.entity.Alumno;

@Controller
public class AlumnoController {

	@Autowired
	private IAlumnoDao alumnodao;
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("alumnos", alumnodao.getAlumnos());
		return "listar";
	}
	
	@RequestMapping("/form")
	public String crear(Map<String, Object> model) {
		Alumno alumno = new Alumno();
		model.put("titulo", "Registrar Alumno");
		model.put("guardar", "Registrar");
		model.put("alumno", alumno);
		return "formulario";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Alumno alumno) {
		alumnodao.save(alumno);
		return "redirect:listar";
	}
	
	@RequestMapping("/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Model model) {
		Alumno alumno = null;
		if(id > 0) {
			alumno = alumnodao.buscarAlumno(id);
		}
		else {
			System.out.println("No existe usuario con ese id");
		}
		model.addAttribute("titulo", "Editar Alumno");
		model.addAttribute("guardar", "Actualizar");
		model.addAttribute("alumno", alumno);
		return "formulario";
	}
	
	@RequestMapping("/eliminarAl/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		if(id > 0) {
			alumnodao.eliminar(id);
		}
		return "redirect:/listar";
	}
	
	
}
