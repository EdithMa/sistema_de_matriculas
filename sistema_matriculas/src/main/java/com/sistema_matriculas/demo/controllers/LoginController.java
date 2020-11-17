package com.sistema_matriculas.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/admin")
	public String index() {
		return "admin/login";
	}
	
	
	@RequestMapping("/log")
	public String index1() {
		return "login";
	}
}
