package com.scp.java.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class LoginEntity 
{
	@Id
	public String username;
	public String password;
	public LoginEntity() 
	{
		super();
	}
	public LoginEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "\nLogin [username=" + username + ", password=" + password + "]";
	}
	

}
