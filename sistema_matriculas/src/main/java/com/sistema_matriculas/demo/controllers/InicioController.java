package com.sistema_matriculas.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

	@RequestMapping({"/index", "/login"})
	public String index() {
		return "login";
	}
	@RequestMapping({"/Principal"})
	public String ingresar() {
		return "PantallaPrincipal";
	}
}
