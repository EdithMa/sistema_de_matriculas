package com.sistema_matriculas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class UsuarioController {
	/*
	@Autowired
	private IUsuarioService uservice;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = uservice.listar();
		model.addAttribute("usuarios", usuarios);
		return "listar";
	}
	*/
}
