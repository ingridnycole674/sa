package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/informacoes")
	public String informacoes() {
		return "informacoes";
	}
	
	@GetMapping("/categorias")
	public String categorias() {
		return "categorias";
	}
	
	
	
	
}
