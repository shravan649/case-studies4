<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<%
		UserBean userBean = (UserBean) session.getAttribute("userBean");
	%>
	<div align="center">

		<table>
			<tr>
				<td>firstName :-</td>
				<td><%=userBean.getFirstName()%></td>
			</tr>
			<tr>
				<td>lastName :-</td>
				<td><%=userBean.getLastName()%></td>
			</tr>
			<tr>
				<td>bookName :-</td>
				<td><%=userBean.getBookName()%></td>
			</tr>
			<tr>
				<td>movieName :-</td>
				<td><%=userBean.getMovieName()%></td>
			</tr>
			<tr>
				<td>fruitName :-</td>
				<td><%=userBean.getFruitName()%></td>
			</tr>
		</table>
	</div>
</body>
</html>