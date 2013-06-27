<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@include file="head_test_case.jsp" %>

</head>
<body>
	<h3>Test Case Detail Page Title</h3>
	<form:form method="post" commandName="testCaseDetail" action="">
		<form:hidden path="id" value="${testCaseDetail.id}"/>
		<form:input path="name" value="${testCaseDetail.name}"/>
		<form:textarea path="description" value="${testCaseDetail.description}"/>
		<form:select path="fkTestCaseStatus">
			<form:options items="${testCaseStatusList}" itemValue="id" itemLabel="name"/>
		</form:select>
		<input type="submit" value="update">
	</form:form>
	<br/><br/><br/>
	<h4>Steps</h4>
	<form name="steps" id="steps">
		<div>
			<input type="text" name="num"/>
			<input type="text" name="description"/>
			<input type="text" name="action"/>
			<input type="button" value="remove"/>
			<input type="button" value="update"/>
		</div>
	</form>	

	
</body>
</body>
</html>