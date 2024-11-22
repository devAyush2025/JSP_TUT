<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" session="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div class="border border-1 border-black container p-4"
		style="width: 350px">


		<form action="todo_demo.jsp">
			 <b>Add to do :</b> <input type="text" name="todo_item">
			 <input type="submit" value="add">
			 
		<% List<String> todo_list = (List<String>)session.getAttribute("todo_list");
			if(todo_list==null){
				todo_list = new ArrayList<String>();
				session.setAttribute("todo_list", todo_list);
			}
			
			String todo_item = request.getParameter("todo_item");
			
			if((todo_item !="" && todo_item!=null)){
				todo_list.add(todo_item);
			}
	
		%>
		<hr>
		
		<b>TodoList items : </b><br>
		<ol>
		<%
		
		for(String todo :todo_list){
			out.print("<li>"+ todo +"</li>");
		}
		%>
		</ol>
			 



		</form>
	</div>
</body>
</html>