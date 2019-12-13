package com.scp.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.java.beans.Registration;
import com.scp.java.dao.RegistrationDaoImpl;
import com.scp.java.entities.RegistrationEntity;

@Service("service")
public class RegistrationServiceImpl implements RegistrationService
{
	@Autowired
	public RegistrationDaoImpl registrationDaoImpl;
	
	
	public RegistrationDaoImpl getRegistrationDaoImpl() {
		return registrationDaoImpl;
	}
	
	public void setRegistrationDaoImpl(RegistrationDaoImpl registrationDaoImpl) {
		this.registrationDaoImpl = registrationDaoImpl;
	}

	private Registration convertToPOJO(RegistrationEntity reg) {
		Registration regg = new Registration();
		regg.setRegId(reg.getRegId());
		regg.setAddress(reg.getAddress());
		regg.setGender(reg.getGender());
		regg.setEmail(reg.getEmail());
		regg.setFullname(reg.getFullname());
		regg.setHobbies(reg.getHobbies());
		regg.setSkillset(reg.getSkillset());
		regg.setUsername(reg.getUsername());
		regg.setPassword(reg.getPassword());
		regg.setConfirmpwd(reg.getConfirmpwd());
		regg.setYearofexp(reg.getYearofexp());
	
		return regg;
	}

	private RegistrationEntity convertToEntity(Registration reg) {
		RegistrationEntity regg = new RegistrationEntity();
		regg.setRegId(reg.getRegId());
		regg.setAddress(reg.getAddress());
		regg.setGender(reg.getGender());
		regg.setEmail(reg.getEmail());
		regg.setFullname(reg.getFullname());
		regg.setHobbies(reg.getHobbies());
		regg.setSkillset(reg.getSkillset());
		regg.setUsername(reg.getUsername());
		regg.setPassword(reg.getPassword());
		regg.setConfirmpwd(reg.getConfirmpwd());
		regg.setYearofexp(reg.getYearofexp());
	
		return regg;
	}
	public int add(Registration reg) {
		return registrationDaoImpl.add(convertToEntity(reg));
	}
	
	public Registration get(int regId) {
		return null;
	}

	public List<Registration> getAll() {
		return null;
	}

	public String delete(int regId) {
		return null;
	}

	public Registration update(Registration reg) {
		return null;
	}

	

}
