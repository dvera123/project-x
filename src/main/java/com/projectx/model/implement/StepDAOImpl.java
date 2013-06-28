package com.projectx.model.implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.projectx.domain.Step;
import com.projectx.domain.TestCase;
import com.projectx.model.dao.StepDAO;
import com.projectx.util.HibernateUtil;

public class StepDAOImpl implements StepDAO{
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void saveStep(Step step) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStep(Step step) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStepById(int stepId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Step> listStep() {
		Query qr = session.getNamedQuery("Step.findAll");
        return qr.list();
	}

	@Override
	public Step getStepByCriteria(int stepId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Step> listStepByFkTestCase(TestCase testCase) {
		Query qr = session.getNamedQuery("Step.findByFkTestCase");
		qr.setParameter("fkTestCase", testCase);
        return qr.list();
	}

}
