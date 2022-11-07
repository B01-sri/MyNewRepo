<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
String empId = (String) request.getAttribute("empId");
    
%>
<%@include file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Employee Update Form</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td><label>Enter Employee ID:</label></td>
					<td><input type="text" value="<%=empId %>" name="empId" disabled="disabled"></td>
				</tr>
				<tr>
					<td><label>Enter Employee Name:</label></td>
					<td><input type="text" name="empName" placeholder=Name></td>
				</tr>
				<tr>
					<td><label>Enter email address :</label></td>
					<td><input type="email" name="emailId" placeholder=Email></td>
				</tr>
				<tr>
					<td><label>Enter your password:</label></td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<input type="submit" value="Update"> 
			<input type="reset"  value="Reset">
		</form>
	</fieldset>
</body>
</html>