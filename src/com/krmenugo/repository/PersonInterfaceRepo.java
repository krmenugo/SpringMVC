package com.krmenugo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.model.PersonModel;

@Repository
public interface PersonInterfaceRepo extends JpaRepository<PersonModel, Integer>{

	//
	
}
