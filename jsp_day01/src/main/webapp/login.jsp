<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("fname");
		String pwd = request.getParameter("pass");
		
		if(name.equals("admin") && pwd.equals("admin123")){
			out.write("Login Successfull");
		}
		else{
			out.write("invalid credentials");
			request.getRequestDispatcher("third.jsp").include(request, response);
		}
	%>
</body>
</html>