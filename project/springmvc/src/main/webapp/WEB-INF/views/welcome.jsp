<%@page import="com.te.springmvc.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
Employee string = (Employee) request.getAttribute("name");
// String passwrd = (String) request.getAttribute("pass");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Welcome
		<%
	out.print(string.getUser());
	%>
	</h1>
	<%-- <h1>
		Your password is
		<%=string.getPwd()%>
	</h1> --%>
</body>
</html>