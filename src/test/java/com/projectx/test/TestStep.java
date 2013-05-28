package com.projectx.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.projectx.util.HibernateUtil;


public class TestStep {
	
	@Test
	public void getStepById(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query qr = session.getNamedQuery("TestCase.findAll");
        List l = qr.list();
        for(Object item: l){
        	System.out.println(item.toString());
        }
        
	}


}
