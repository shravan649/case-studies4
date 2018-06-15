package com.cg.project.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.UserBean;

@WebServlet("/PersonalInfoServlet")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName= request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		UserBean userBean = new UserBean(firstName, lastName);
		ServletContext context = getServletContext();
		context.setAttribute("userBean", userBean);
		RequestDispatcher dispatcher=request.getRequestDispatcher("socialInfoPage.jsp");
		dispatcher.forward(request, response);
	}

}
