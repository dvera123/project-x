<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@include file="head_test_case.jsp" %>

</head>
<body>
	<h3>Test Case Page Title</h3>
	<c:if test="${fn:length(testCaseList) > 0}">
		<c:forEach items="${testCaseList}" var="testCase" varStatus="status">
			<div>${fn:toLowerCase(testCase.name)}</div>
				<input type="submit" value="update">
		</c:forEach>
	</c:if>
	<form:form method="post" commandName="testCase" action="save.do">
		<form:input path="name" />
		<form:input path="description" />
		<form:select path="fkTestCaseStatus">
			<c:forEach items="${testCaseStatusList}" var="testCaseStatus" varStatus="status">
				<form:option value="${testCaseStatus.id}">${testCaseStatus.name}</form:option>
			</c:forEach>
		</form:select>
		<input type="submit" value="save">
	</form:form>
	
	<a href="#myModal" role="button" class="btn" data-toggle="modal">Launch demo modal</a>
</body>
</body>
</html>