package com.projectx.model.implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.projectx.domain.TestCase;
import com.projectx.model.dao.TestCaseDAO;
import com.projectx.util.HibernateUtil;

public class TestCaseDAOImpl implements TestCaseDAO{

	Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public void saveTestCase(TestCase testCase) {
		Transaction tr = null;
        tr = session.beginTransaction();
        session.saveOrUpdate(testCase);
        tr.commit();
		
	}

	@Override
	public void updateTestCase(TestCase testCase) {
		Transaction tr = null;
        tr = session.beginTransaction();
        session.saveOrUpdate(testCase);
        tr.commit();
		
	}

	@Override
	public void removeTestCaseById(int testCaseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TestCase> listTestCase() {
		//session.flush();
		Query qr = session.getNamedQuery("TestCase.findAll");
        return qr.list();
	}

	@Override
	public TestCase getTestCaseByCriteria(int testCaseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
