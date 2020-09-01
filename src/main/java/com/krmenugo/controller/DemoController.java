package com.krmenugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krmenugo.model.PersonModel;
import com.krmenugo.repository.PersonInterfaceRepo;

//http://localhost:9898/...
@Controller
public class DemoController {
	
	@Autowired
	private PersonInterfaceRepo repo;
	
	@GetMapping("/greeting") //greeting?name=?
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		PersonModel personData = new PersonModel();
			personData.setIdPerson(4);
			personData.setName("Luis David");
			repo.save(personData);
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("persons", repo.findAll());
		return "greeting";
	}
	
}