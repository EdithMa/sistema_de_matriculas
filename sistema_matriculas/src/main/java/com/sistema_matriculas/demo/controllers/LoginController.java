package com.sistema_matriculas.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/apoderado")
	public String index3() {
		return "/apoderado/login";
	}
	@RequestMapping("/apoderado/index")
	public String index4() {
		return "/apoderado/index";
	}
}
