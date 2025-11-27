package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/citas")
public class CitasController {

	
	@GetMapping("/lista_citas")
	public String list_citas () {
		return "citas/lista_citas";
	}
	
}
