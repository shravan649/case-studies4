<%@ page session="false" %>

<html>
<body>
	<div>
		<form name="personalInfoFrm" action="PersonalInfoServlet" method="post">
		<table>
		<tr>
			<td>Enter firstName :- </td>
			<td><input type="text" name="firstName">
		</tr>
		<tr>
			<td>Enter lastName :- </td>
			<td><input type="text" name="lastName">
		</tr>
		<tr>
			<td><input type="submit" name="submit">
		</tr>
		</table>
		</form>
	</div>
</body>
</html>