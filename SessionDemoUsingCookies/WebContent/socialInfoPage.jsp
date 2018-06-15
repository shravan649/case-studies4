<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<div>
		<%
			UserBean userBean = (UserBean) request.getAttribute("userBean");
			Cookie c1 = new  Cookie("firstName",userBean.getFirstName());
			Cookie c2 = new Cookie("lastName" ,userBean.getLastName());
			response.addCookie(c1);
			response.addCookie(c2);
			
		%>
		<font size=10>Welcome <%=userBean.getFirstName()%></font>
		<form name="socialInfoFrm" action="SocialInfoServlet" method="post">
			<table>
				<tr>
					<td>Enter fruitName</td>
					<td><input type="text" name="fruitName"/></td>
				</tr>
				<tr>
					<td>Enter movieName</td>
					<td><input type="text" name="movieName"/></td>
				</tr>
				<tr>
					<td>Enter bookName</td>
					<td><input type="text" name="bookName"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>