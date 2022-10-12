<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		String name=(String) request.getAttribute("name");
		Integer id=(Integer) request.getAttribute("id");
		List<String> students=(List<String>)request.getAttribute("s");
	%>
	<h1>You are on Home Page</h1>
	<h1>My name is <%=name%></h1>
	<h1>My id is <%=id %></h1>
	<%
		for(String student:students){
	%>
		<h1><%=student%></h1>
		<% 
			}
		%>
</body>
</html>