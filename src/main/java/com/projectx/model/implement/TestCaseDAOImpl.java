package com.projectx.model.implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.projectx.domain.TestCase;
import com.projectx.model.dao.TestCaseDAO;
import com.projectx.util.HibernateUtil;

public class TestCaseDAOImpl implements TestCaseDAO{

	Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public void saveTestCase(TestCase testCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTestCase(TestCase testCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTestCaseById(int testCaseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TestCase> listTestCase() {
		Query qr = session.getNamedQuery("TestCase.findAll");
        return qr.list();
	}

	@Override
	public TestCase getTestCaseByCriteria(int testCaseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
