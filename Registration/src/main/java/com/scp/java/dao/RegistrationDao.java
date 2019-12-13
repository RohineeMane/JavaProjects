package com.scp.java.dao;

import java.util.List;

import com.scp.java.entities.RegistrationEntity;

public interface RegistrationDao 
{
	public int add(RegistrationEntity reg);
	public RegistrationEntity get(int regId);
	public List<RegistrationEntity> getAll();
	public String delete(int regId);
	public RegistrationEntity update(RegistrationEntity reg);
}
