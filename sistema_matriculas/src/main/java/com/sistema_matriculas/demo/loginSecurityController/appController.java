package com.sistema_matriculas.demo.loginSecurityController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class appController {
	
	@GetMapping("/administrador")
	public String admin() {
		return "admin/administrador";
	}
	
	@GetMapping("/user")
	public String user() {
		return "admin/user";
	}
		
	@RequestMapping("/menu")
	public String index() {
		return "/admin/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/admin/login";
	}
}
