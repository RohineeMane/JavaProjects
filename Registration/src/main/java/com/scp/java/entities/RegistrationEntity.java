package com.scp.java.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class RegistrationEntity
{
	@Id
	public int regId;
	public String fullname;
	public String Address;
	public String Email;
	public String gender;
	public String skillset;
	public int yearofexp;
	public String hobbies;
	public String username;
	public String password;
	public String confirmpwd;
	public RegistrationEntity() {
		super();
	}
	public RegistrationEntity(int regId, String fullname, String address, String email, String gender,
			String skillset, int yearofexp, String hobbies, String username, String password, String confirmpwd) {
		super();
		this.regId = regId;
		this.fullname = fullname;
		Address = address;
		Email = email;
		this.gender = gender;
		this.skillset = skillset;
		this.yearofexp = yearofexp;
		this.hobbies = hobbies;
		this.username = username;
		this.password = password;
		this.confirmpwd = confirmpwd;
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId2) {
		this.regId = regId2;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public int getYearofexp() {
		return yearofexp;
	}
	public void setYearofexp(int yearofexp) {
		this.yearofexp = yearofexp;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
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
	public String getConfirmpwd() {
		return confirmpwd;
	}
	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}
	@Override
	public String toString() {
		return "\nRegistrationEntity [regId=" + regId + ", fullname=" + fullname + ", Address=" + Address + ", Email="
				+ Email + ", gender=" + gender + ", skillset=" + skillset + ", yearofexp=" + yearofexp + ", hobbies="
				+ hobbies + ", username=" + username + ", password=" + password + ", confirmpwd=" + confirmpwd + "]";
	}
	
	
}
