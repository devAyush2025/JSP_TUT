<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
		<h1>Student Form</h1>
		
		<hr>
		
		<form:form action="addStudent" method="post" modelAttribute="student">
			
				<label>Enter Firstname</label> <form:input path="firstName"/>
				<br>
				<label>Enter Lastname</label> <form:input path="lastName"/>
				
				<form:button value="submit">Submit</form:button>
					
				
		
		</form:form>
</body>
</html>