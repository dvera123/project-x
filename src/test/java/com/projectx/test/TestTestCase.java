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

public class TestTestCase {
	private Session session;
	
	@Before
	public void setup(){
		session = HibernateUtil.getSessionFactory().openSession();
	}
	//@Test
	public void insertTestCase(){
		TestCase testCase = new TestCase();

		TestCaseStatus testCaseStatus = new TestCaseStatus();
		testCaseStatus.setId(1);
		
		testCase.setName("Test Case 4");
		testCase.setFkTestCaseStatus(testCaseStatus);
		
		Transaction tr = null;
        tr = session.beginTransaction();
        session.saveOrUpdate(testCase);
        //tr.commit();
	}
	//@Test
	public void getTestCase(){
		Query qr = session.getNamedQuery("TestCase.findAll");
        List l = qr.list();
        for(Object item: l){
        	System.out.println(item.toString());
        }
	}
	//@Test
	public void updateTestCase(){
		TestCase testCase = getTestCaseByID(1);
		testCase.setName("Test Case 1");
		
		Transaction tr = null;
        tr = session.beginTransaction();
        
        TestCase tc = (TestCase) session.get(TestCase.class,testCase.getId());
        tc.setName(testCase.getName());
        tc.setDescription(testCase.getDescription());
        tc.setFkTestCaseStatus(testCase.getFkTestCaseStatus());
        session.update(tc);
        tr.commit();
		
	}
	//@Test
	public void getTestCaseByID(){
		Query qr = session.getNamedQuery("TestCase.findById");
        qr.setParameter("id", 2);
        List l = qr.list();
        TestCase testCase = (TestCase) l.get(0);
        System.out.print(testCase.getName());
	}
	//@Test
	private TestCase getTestCaseByID(int id){
		Query qr = session.getNamedQuery("TestCase.findById");
        qr.setParameter("id", id);
        List l = qr.list();
        return (TestCase) l.get(0);
		
	}
	//@Test
	public void deleteTestCaseByID(){
		Integer testCaseId = new Integer(4);
		Transaction tr = null;
        tr = session.beginTransaction();
        Object tc = session.get(TestCase.class,testCaseId);
        session.delete(tc);
        tr.commit();
	}

}
