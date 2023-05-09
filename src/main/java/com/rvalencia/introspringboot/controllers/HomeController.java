package com.rvalencia.introspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//con resquest mapping "/" le damos la ruta para que sea en el navegador
		@RequestMapping("/")
		public String rutaRaiz() {
			return "Hola Cliente! Bienvenido a esta página";
		}
		
		@RequestMapping("/random")
		public String rutaRamdon() {
			return "Hola, está es una demostración de Spring Boot! ";
		}
}
