package com.hqsocial.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRuta {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","Enviar parametros de la ruta pathvaraibles");
		
		return "variables/index";
	}
	
	@GetMapping("/strings/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta pathvaraibles");
		model.addAttribute("resultado","El texto enviuado en la ruta es: " + texto);
		return "variables/ver";
		
	}
	@GetMapping("/strings/{texto}/{numero}")
	public String variables(@PathVariable String texto,@PathVariable Integer numero, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta pathvaraibles");
		model.addAttribute("resultado","El texto enviuado en la ruta es: " + texto + " yel numero enviado en el path es: " + numero);
		return "variables/ver";
		
	}
}

