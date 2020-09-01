package com.krmenugo.model;

import javax.persistence.*;

@Entity
@Table(name="roles") 
public class RoleModel {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRole;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private UserModel idUser;
	
	@Column(name = "role", length = 100)
	private String role;

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public UserModel getIdUser() {
		return idUser;
	}

	public void setIdUser(UserModel idUser) {
		this.idUser = idUser;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
