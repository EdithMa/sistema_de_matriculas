package com.sistema_matriculas.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {

		@RequestMapping("/")
		public String index() {
			return "/principal/index";
		}
		
}
