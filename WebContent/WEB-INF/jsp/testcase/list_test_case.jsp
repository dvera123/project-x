<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:if test="${fn:length(testCaseList) > 0}">
			<c:forEach items="${testCaseList}" var="testCase" varStatus="status">
				<div>${fn:toLowerCase(testCase.name)}</div>
					<input type="submit" value="update">
			</c:forEach>
</c:if>