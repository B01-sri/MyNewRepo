<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String errMsg = (String)request.getAttribute("errMsg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>LOGIN FORM</legend>
		<form action="./login">
			<table>
				<tr>
					<td><label>Enter Employee Id</label></td>
					<td><input type="text" name="empId"></td>

				</tr>
				<tr>
					<td><label>Enter Employee Password</label></td>
					<td><input type="password" name="password"></td>

				</tr>

				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="submit" value="Reset"></td>
				</tr>


			</table>
		</form>
	</fieldset>
</body>
</html>