<%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${!empty empList}">
		<table border="1" bgcolor="cyan">
			<tr bgcolor="pink">
				<th>eno</th>
				<th>ename</th>
				<th>edesg</th>
				<th>salary</th>
				<th>deptNo</th>
				<th>operations</th>
			</tr>
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.empNo }</td>

					<td>${emp.ename }</td>

					<td>${emp.job}</td>

					<td>${emp.deptNo}</td>
					<td><a href="edit_employee?eno=${emp.empNo}"><img src="images/Edit.png"/></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
</c:choose>
























