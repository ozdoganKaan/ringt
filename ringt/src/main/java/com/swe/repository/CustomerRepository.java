package com.swe.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
}
