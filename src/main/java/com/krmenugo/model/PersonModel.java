package com.krmenugo.model;

import javax.persistence.*;

@Entity
@Table(name="persons")
public class PersonModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerson;
	
	@Column(name = "name", length = 50)	
	private String name;

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

