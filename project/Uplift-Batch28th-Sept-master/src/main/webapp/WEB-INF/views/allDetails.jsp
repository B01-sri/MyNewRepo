<%@page import="com.te.empmanagementsystem.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
List<Employee> emp = (List<Employee>) request.getAttribute("Employee_Details");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

<title>Insert title here</title>


</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<h1>Employee Details :</h1>
	<div class="mx-auto" style="width: 1000px;">


		<Table class="table table-striped-columns table table-bordered">


			<br>



			<tr>
				<th>Employee ID</th>
				<th>Employee NAME</th>
				<th>Employee Email</th>
			</tr>
			<tbody class="table-group-divider">
				<%
				for (Employee employee : emp) {
				%>
				<tr>
					<td><%=employee.getEmpId()%></td>
					<td><%=employee.getEmpName()%></td>
					<td><%=employee.getEmailId()%></td>
				</tr>
			</tbody>
			<%
			}
			%>

		</Table>
	</div>
</body>
</html>