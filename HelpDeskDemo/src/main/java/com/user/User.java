package com.user;

public class User {
	
	private int iduser;
	private String name;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	public User(int iduser, String name, String email, String phone, String username, String password) {
		 
		this.iduser = iduser;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getIduser() {
		return iduser;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	 
	
	
	

}
