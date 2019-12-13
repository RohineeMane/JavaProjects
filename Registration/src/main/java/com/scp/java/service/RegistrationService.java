package com.scp.java.service;

import java.util.List;

import com.scp.java.beans.Registration;


public interface RegistrationService 
{
	public int add(Registration reg);
	public Registration get(int regId);
	public List<Registration> getAll();
	public String delete(int regId);
	public Registration update(Registration reg);
}
