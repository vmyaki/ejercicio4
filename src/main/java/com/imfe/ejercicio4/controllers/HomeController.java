package com.imfe.ejercicio4.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejercicio4.model.Coche;
import com.imfe.ejercicio4.services.ConcesionarioService;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
		
	}
	
	@RequestMapping(value="/encargar")
	public String encargar(Model model,@RequestParam("modelo") String modelo) {
		
		//Creamos un servicio
		ConcesionarioService rdo= new ConcesionarioService();
		
		//Llamamos al metodo service pasandole el parametro modelo y metemos en un array el resultado
		Coche cocheNuevo=rdo.service(modelo);
		
		model.addAttribute("resultado", cocheNuevo);
		
		return "index";
	}

}
