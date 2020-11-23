package com.sistema_matriculas.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sistema_matriculas.demo.models.dao.ILectivoDAO;
import com.sistema_matriculas.demo.models.entity.Alumno;
import com.sistema_matriculas.demo.models.entity.AnioLectivo;

@Controller
@RequestMapping("/lectivo")
public class LectivoController {

	@Autowired
	private ILectivoDAO lectivodao;
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("anio_lectivo", lectivodao.getAnioLectivos());
		return "/lectivo/listar";
	}
	
	@RequestMapping("/form")
	public String crear(Map<String, Object> model) {
		AnioLectivo anioLectivo = new AnioLectivo();
		model.put("titulo", "Registrar periodo académico");
		model.put("guardaranio", "Registrar");
		model.put("anioLectivo", anioLectivo);
		return "/lectivo/form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(AnioLectivo anioLectivo) {
		lectivodao.save(anioLectivo);
		return "redirect:/lectivo/listar";
	}
	
	@RequestMapping("/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Model model) {
		AnioLectivo anioLectivo = null;
		if(id > 0) {
			anioLectivo = lectivodao.buscarAnioLectivo(id);
		}
		else {
			return "redirect:/lectivo/listar";
		}
		model.addAttribute("titulo", "Editar año lectivo");
		model.addAttribute("guardaranio", "Actualizar");
		model.addAttribute("anioLectivo", anioLectivo);
		return "/lectivo/form";
	}
	
	@RequestMapping("/eliminarlectivo/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		if(id > 0) {
			lectivodao.eliminar(id);
		}
		return "redirect:/lectivo/listar";
	}
}
