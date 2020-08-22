package com.krmenugo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.model.PersonaModel;

@Repository
public interface PersonaInterfaceRepo extends JpaRepository<PersonaModel, Integer>{

	
	
}
