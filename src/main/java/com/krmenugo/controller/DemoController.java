package com.krmenugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krmenugo.model.PersonaModel;
import com.krmenugo.repository.PersonaInterfaceRepo;

// CONTROLLER: REDIRIGIR LA PETICIÓN DEL USUARIO A UNA LÓGICA DE NEGOCIO
@Controller
public class DemoController {
	
	@Autowired
	private PersonaInterfaceRepo repo;
	
	@GetMapping("/greeting") // http://localhost:9898/greeting?name=Carmen
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		PersonaModel persona = new PersonaModel();
		persona.setIdPersona(1);
		persona.setNombre("Román :3");
		repo.save(persona);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
}