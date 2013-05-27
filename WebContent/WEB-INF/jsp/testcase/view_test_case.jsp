<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Case Page</title>
</head>
<body>
	<h3>Test Case Page</h3>
	<body>
	<h3>Test Case Page Title</h3>
	<c:if test="${fn:length(testCaseList) > 0}">
		<c:forEach items="${testCaseList}" var="testCase" varStatus="status">
			<h4>${fn:toLowerCase(testCase.name)}</h4>
		</c:forEach>
	</c:if>
</body>
</body>
</html>