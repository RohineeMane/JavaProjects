package com.scp.java.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scp.java.beans.Registration;
import com.scp.java.config.RegistrationConfig;
import com.scp.java.service.RegistrationServiceImpl;


public class TestRegistration 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(RegistrationConfig.class);
		RegistrationServiceImpl service =(RegistrationServiceImpl)context.getBean("service");
		Registration reg=new Registration(111, "rohineemane", "pune", "rohinee@gmail.com", "female", "Java", 3, "Trekking", "rohinee", "rohinee@123", "rohinee@123");
		int regId  = service.add(reg);
		System.out.println(regId);
	}
}
