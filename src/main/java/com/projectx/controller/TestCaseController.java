package com.projectx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import com.projectx.domain.TestCase;
import com.projectx.model.dao.TestCaseDAO;


public class TestCaseController extends MultiActionController{
	
	private TestCaseDAO testCaseDAO;
	
	public ModelAndView list(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("testCaseList", testCaseDAO.listTestCase());
        modelMap.addAttribute("testCase", new TestCase());
        
        return new ModelAndView("testcase/view_test_case", modelMap);
    }

	public TestCaseDAO getTestCaseDAO() {
		return testCaseDAO;
	}

	public void setTestCaseDAO(TestCaseDAO testCaseDAO) {
		this.testCaseDAO = testCaseDAO;
	}

}
