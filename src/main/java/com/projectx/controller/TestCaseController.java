package com.projectx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.log4j.helpers.LogLog;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.projectx.domain.TestCase;
import com.projectx.domain.TestCaseStatus;
import com.projectx.model.dao.TestCaseDAO;
import com.projectx.model.dao.TestCaseStatusDAO;


public class TestCaseController extends MultiActionController{
	
	private TestCaseDAO testCaseDAO;
	private TestCaseStatusDAO testCaseStatusDAO;
	
	public ModelAndView list(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        /*
        LogLog.warn("here warn");
        LogLog.error("here error");
        */
        modelMap.addAttribute("testCaseList", testCaseDAO.listTestCase());
        modelMap.addAttribute("testCase", new TestCase());
        
        modelMap.addAttribute("testCaseStatusList", testCaseStatusDAO.listTestCaseStatus());
        modelMap.addAttribute("testCaseStatus", new TestCaseStatus());
        
        return new ModelAndView("testcase/view_test_case", modelMap);
    }
	
	@RequestMapping(value="/save.do",method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelMap modelMap = new ModelMap();
        
        TestCase testcase = new TestCase();
       
        testcase.setDescription(request.getParameter("description"));
        testcase.setName(request.getParameter("name"));
        testcase.setFkTestCaseStatus(new TestCaseStatus(Integer.parseInt(request.getParameter("fkTestCaseStatus"))));
        
        testCaseDAO.saveTestCase(testcase);
        
        modelMap.addAttribute("testCaseList", testCaseDAO.listTestCase());
        modelMap.addAttribute("testCase", new TestCase());
      
        
        return new ModelAndView("testcase/list_test_case", modelMap);
    }
	//Test Case DAO
	public TestCaseDAO getTestCaseDAO() {
		return testCaseDAO;
	}

	public void setTestCaseDAO(TestCaseDAO testCaseDAO) {
		this.testCaseDAO = testCaseDAO;
	}
	//Test Case Status DAO Impl
	public TestCaseStatusDAO getTestCaseStatusDAO() {
		return testCaseStatusDAO;
	}

	public void setTestCaseStatusDAO(TestCaseStatusDAO testCaseStatusDAO) {
		this.testCaseStatusDAO = testCaseStatusDAO;
	}

}
