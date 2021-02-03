<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Manually Configured Spring MVC Application</h2>
<hr>
<form name="frm" method="post" action="check">
<table>
<tr>
<td>UserID
<td><input type="text" name="userid" required>
</tr>

<tr>
<td>Password
<td><input type="password" name="pass" required>
</tr>

<tr>
<td><input type="submit" value="Submit">
<td>
</tr>


</table>
</form>
<a href="register">New user registration</a>
<br>
<a href="acreport">Accounts Report</a>
<br>
<a href="newaccount">Open New Account</a>
<br><br>
<hr>
<center>
<span style="color:purple;font-size: 15px;font-family:tahoma">
developed at chetanbhoyar
<br>
powered by Spring
</span>
</center>
</body>
</html>