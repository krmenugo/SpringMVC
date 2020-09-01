package com.krmenugo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krmenugo.model.PersonModel;
import com.krmenugo.repository.PersonInterfaceRepo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/persons")
public class RestController {
	
	@Autowired
	private PersonInterfaceRepo repo;

	@GetMapping("list")
	public List<PersonModel> listPerson() {
		return repo.findAll();
	}
	
	@PostMapping("create")
	//@RequestBody to convert an object JSON to object Java
	public PersonModel createPerson(@RequestBody PersonModel person) {
		return repo.save(person);
	}

	@PutMapping("update")
	public PersonModel updatePerson(@RequestBody PersonModel person) {
		return repo.save(person);
	}
	
	@DeleteMapping(value = "/(idPerson)")
	public void deletePerson(@PathVariable("idPerson") Integer id) {
		repo.deleteById(id);
	}
	
}
