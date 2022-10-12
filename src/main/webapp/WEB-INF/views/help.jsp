<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
		<%
			String name=(String)request.getAttribute("name");
			LocalDateTime date=(LocalDateTime)request.getAttribute("date");
		%>
			<h1><%=name%></h1>
			<h1>Today's date is <%=date%></h1>
	
</body>
</html>