package com.eve.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.eve.dto.entry;
@Component
public class entryDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	@Autowired
	EntityManager entityManager;
	@Autowired
	EntityTransaction entityTransaction;


public entry saveAttendance(entry entry) {
	entityTransaction.begin();
	 entityManager.persist(entry);
	 entityTransaction.commit();
	 return entry;
}

public entry updateAttendance(entry entry) {
	entityTransaction.begin();
	 entityManager.merge(entry);
	 entityTransaction.commit();
	 return entry;
}
}


