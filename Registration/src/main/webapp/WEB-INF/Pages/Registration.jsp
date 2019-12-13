<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form:form action="http://localhost:8082/Registration/Registration/signup"
method="post" modelAttribute="empbn"> 
			Registration Id : <form:input path="regId" value="${empbn.regId }"/> <br><br>
			Full Name : <form:input path="empName" value="${empbn.empName }"/><br><br>
			EmpSalary : <form:input path="empSalary" value="${empbn.empSalary }"/><br><br>
			EmpAddress : <form:input path="empAddress" value="${empbn.empAddress }"/><br><br>
			<input type="submit">
</form:form>


<table>
		<tr>
				<th>EmpId</th>
				<th>EmpName</th>
				<th>EmpSalary</th>
				<th>EmpAddress</th>
			<th>Action</th>	
		</tr>
			
			<c:forEach items="${employees}" var="emp">
					<tr>
							<td><c:out value="${emp.empId}"></c:out></td>
							<td><c:out value="${emp.empName}"></c:out></td>
							<td><c:out value="${emp.empSalary}"></c:out></td>
							<td><c:out value="${emp.empAddress}"></c:out></td>
							<td>
								<a href="http://localhost:8082/springproj/employee/update/${emp.empId}">EDIT</a>
								<a href="http://localhost:8082/springproj/employee/delete/${emp.empId}">DELETE</a>							
							
							</td>
					</tr>
			</c:forEach>
</table>


</body>
</html>