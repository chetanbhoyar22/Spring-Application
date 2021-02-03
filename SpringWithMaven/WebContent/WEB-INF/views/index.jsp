<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Spring with Maven project</h2>
<hr>
<form name="frm" method="post" action="login">
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
<br><br>
<h3>Search account Information</h3>

<form name="frm1" method="post" action="search">
Account Number <input type="text" name="ano">
<input type="submit" value="Submit">

</form>
</body>
</html>