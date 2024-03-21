package com.eve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eve.dto.guest;


@Component
public class guestDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	@Autowired
	EntityManager entityManager;
	@Autowired
	EntityTransaction entityTransaction;
	
	public guest saveEmployee(guest guest) {
	entityTransaction.begin();
	 entityManager.persist(guest);
	 entityTransaction.commit();
	 return guest;
	}
	 
	 public guest updateEmployee(guest guest) {
		 entityTransaction.begin();
		 entityManager.merge(guest);
		 entityTransaction.commit();
		 return guest;
	 }
	 public guest deleteEmployee(guest guest) {
		 entityTransaction.begin();
		 entityManager.remove(guest);
		 entityTransaction.commit();
		 return guest;
		 
	 }
	 public guest findEmpByPhnoAndPassword(String eve_name,String cityname) {
	 Query query=entityManager.createQuery("select e from guest e where eve_name=?1 and cityname=?2");
	 query.setParameter(1,eve_name);
	 query.setParameter(2,cityname);
	 List <guest>guest= query.getResultList();
	 return guest.get(0);
}
	 
	 
	 
	
	
	

}


