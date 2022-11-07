<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String empId = (String) request.getAttribute("empId");
%>
<%
String ename = (String) request.getAttribute("Ename");
%>
<%
String eemail = (String) request.getAttribute("E-email");
%>

<%@include file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<Table>
		<tr>
			<td>
				<h1>
					Employee Details of
					<%=ename%>
					:
				</h1>
			</td>
		</tr>
		<tr>
			<td>Employee ID: <%=empId%>
			</td>
		</tr>
		<tr>
			<td>Employee NAME: <%=ename%>
			</td>
		</tr>
		<tr>
			<td>Employee Email: <%=eemail%>
			</td>
		</tr>




	</Table>

</body>
</html>