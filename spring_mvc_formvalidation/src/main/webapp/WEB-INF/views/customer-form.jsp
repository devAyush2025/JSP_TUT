<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<style type="text/css">
	.error{
	color: red;
	
	}
</style>
<title>Customer form</title>
</head>
<body>
	<h2>Customer Form</h2>
	
	<hr>
	
	<form:form action="savecustomer" method="post" modelAttribute="customer">
		
		<label>Enter FirstName</label> <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"></form:errors>
		<br><br>
		<label>Enter LastName(*)</label> <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br><br>
		<input type="submit" value="Enter">
	</form:form>
</body>
</html>