package com.sistema_matriculas.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatriculaController {
	
	@RequestMapping("matricula")
	public String index(Model model) {
		return "matricula";
	}

}
