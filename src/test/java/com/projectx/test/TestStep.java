package com.projectx.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import com.projectx.domain.TestCase;
import com.projectx.domain.TestCaseStatus;
import com.projectx.util.HibernateUtil;


public class TestStep {
	
	Session session = null;
	
	@Before
	public void setup(){
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	//@Test
	public void insertTest(){
		
		TestCase testCase = new TestCase();
		TestCaseStatus testCaseStatus = new TestCaseStatus();
		testCaseStatus.setId(1);
		testCase.setName("Test Case 4");
		testCase.setFkTestCaseStatus(testCaseStatus);
		Transaction tr = null;
        tr = session.beginTransaction();
        //session.saveOrUpdate(testCase);
        tr.commit();
        
	}
	
	//@Test
	public void getStepById(){

		Query qr = session.getNamedQuery("TestCase.findAll");
        List l = qr.list();
        for(Object item: l){
        	//System.out.println(item.toString());
        }
        String a = "000125";
        int b = Integer.parseInt(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        
	}
	
	//@Test
	public void updateTest(){
		
		TestCase testCase = new TestCase();
		TestCaseStatus testCaseStatus = new TestCaseStatus();
		testCaseStatus.setId(1);
		testCase.setId(1);
		testCase.setName("Test Case w");
		testCase.setFkTestCaseStatus(testCaseStatus);
		Transaction tr = null;
        tr = session.beginTransaction();
        session.saveOrUpdate(testCase);
        tr.commit();

        
	}


}
