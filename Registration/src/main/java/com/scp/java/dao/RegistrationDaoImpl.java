package com.scp.java.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.java.entities.RegistrationEntity;

@Repository
public class RegistrationDaoImpl implements RegistrationDao
{
	@Autowired
	public SessionFactory sfactory;
	
	public SessionFactory getSfactory() {
		return sfactory;
	}

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public int add(RegistrationEntity reg) {
		Session session =null;
		Transaction tr = null;
		try {
			session =sfactory.openSession();
			tr = session.beginTransaction();
			int regId =  (Integer) session.save(reg);
			System.out.println("User saved successfully...!");
			return regId;
		}catch(Exception e) {
			System.out.println("Problem in save...!"+e.getMessage());
		}finally {
			closeResources(session,tr);
		}
		return 0;
	}
	private void closeResources(Session session, Transaction tr) 
	{
		if(session!=null) {
			if(tr!=null) {
				session.flush();
				tr.commit();
			}
			session.close();
		}
	}
	public RegistrationEntity get(int regId) {
		return null;
		
	}

	

	public List<RegistrationEntity> getAll() {
		return null;
	}

	public String delete(int regId) {
		return null;
	}

	public RegistrationEntity update(RegistrationEntity reg) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
