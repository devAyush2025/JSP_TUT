<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <div
      class="border border-1 border-black container p-4"
      style="width: 350px"
    >
      <form action="login.jsp" method="post">
        <label for="name"> Enter Username</label>
        <input type="text" name="fname" />
        <br>
        <label for="num2"> Enter Password </label>
        <input type="password" name="pass" />
        <br>
        <input type="submit" value="Login" />
      </form>
    </div>
</body>
</html>