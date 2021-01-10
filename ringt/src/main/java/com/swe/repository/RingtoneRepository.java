package com.swe.repository;


import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.swe.entity.Ringtone;

@Repository
public class RingtoneRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Long insert(Ringtone ringtone) {
	return (Long) sessionFactory.getCurrentSession().save(ringtone);
	}
	
	public void delete(Ringtone ringtone) {
		sessionFactory.getCurrentSession().delete(ringtone);
	}
	/*
	public ArrayList<Ringtone> getAll(){
		Query query=sessionFactory.getCurrentSession().createQuery("From Ringtone");
		return (ArrayList<Ringtone>) query.getResultList();
	}
*/
}
