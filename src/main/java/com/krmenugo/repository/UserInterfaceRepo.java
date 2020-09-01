package com.krmenugo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.model.UserModel;

@Repository
public interface UserInterfaceRepo extends JpaRepository<UserModel, Integer> {

	//
	
}
