<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New account Form</h2>
<hr>
<form name="frm" method="post" action="createaccount">
<table>
	<tr>
		<td>Account Id</td>
		<td>
			<input type="text" name="accno"/>
		</td>
	</tr>
	<tr>
		<td>Account Holder</td>
		<td>
			<input type="text" name="accnm"/>
		</td>
	</tr>
	<tr>
		<td>Type</td>
		<td>
			<select name="acctype">
				<option value="saving">Saving</option>
				<option value="current">Current</option>
				<option value="fixed">Fixed</option>
			</select>			

		</td>
	</tr>
	<tr>
		<td>Balance</td>
		<td>
			<input type="text" name="balance"/>
		</td>
	</tr>
	<tr>		
		<td>
			<input type="submit" value="Submit"/>
		</td>
	</tr>
</table>
</form>

</body>
</html>