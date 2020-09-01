package com.krmenugo.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserModel {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int idUser;
	
	@Column(name = "userName", length = 30)
	private String userName;
	
	@Column(name = "password", length = 100)
	private String password;
	
	@Column(name = "enable")
	private int enable;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return userName;
	}

	public void setUser(String user) {
		this.userName = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

}
