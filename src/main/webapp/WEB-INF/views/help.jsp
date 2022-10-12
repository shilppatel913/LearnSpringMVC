<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
		<%-- <%
			String name=(String)request.getAttribute("name");
			LocalDateTime date=(LocalDateTime)request.getAttribute("date");
		%> --%>
			<h1><%-- <%=name%> --%> ${name}</h1>
			<h1>Today's date is <%-- <%=date%> --%> ${date}</h1>
			<h1>${marks}</h1>
			<c:forEach var="item" items="${marks}">
				<h1>${item}</h1>
			</c:forEach>
	
</body>
</html>