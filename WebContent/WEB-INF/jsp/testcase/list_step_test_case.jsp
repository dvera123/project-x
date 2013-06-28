<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h4>Steps <button id="addStep">+</button></h4>

<div class="stepList">
	<c:if test="${fn:length(stepList) > 0}">
		<c:forEach items="${stepList}" var="step" varStatus="count">
			<div class="step ">
				<input type="hidden" name="id" value="${step.id}"/>
				<input type="hidden" name="fkTestCase" value="${step.fkTestCase.id}"/>
				<input type="text" name="num" value="${step.num}"/>
				<input type="text" name="description" value="${step.description}"/>
				<input type="text" name="action" value="${step.action}"/>
				<button class="deleteStep" >-</button>
			</div>
		</c:forEach>
	</c:if>
</div>
<!--Base Step-->
<div class="step hide">
	<input type="hidden" name="id" value=""/>
	<input type="hidden" name="fkTestCase" value="${id}">
	<input type="text" name="num"/>
	<input type="text" name="description"/>
	<input type="text" name="action"/>
	<button class="deleteStep" >-</button>
</div>

<script src="${pageContext.request.contextPath}/assets/js/testcase/manage_step_test_case.js"></script>
