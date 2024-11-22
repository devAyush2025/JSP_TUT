<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2" >

		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
			</tr>
		</thead>

		<c:forEach var="temp" items="${list}">

			<tr>
				<td>${temp.firstName}</td>
				<td>${temp.lastName}</td>
				<td>${temp.email}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>