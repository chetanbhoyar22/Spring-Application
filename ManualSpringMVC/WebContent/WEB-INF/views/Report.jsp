<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Accounts Report in Spring Style</h2>
<hr>
<table width="500" border="1" bordercolor="beige" cellspacing="0">
<tr style="background-color:azure">
<th>Id</th>
<th>Name</th>
<th>Type</th>
<th>Balance</th>
 </tr>

<spring:forEach items="${datalist}" var="ac">

<tr>
<td>${ac.accno}</td>
<td>${ac.accnm}</td>
<td>${ac.acctype}</td>
<td>${ac.balance}</td>
</tr>

</spring:forEach>

</table>
</body>
</html>