package com.hqsocial.springboot.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "redirect:/app/listar";
		//return "redirect:https:www.google.com.co";
	}

}
