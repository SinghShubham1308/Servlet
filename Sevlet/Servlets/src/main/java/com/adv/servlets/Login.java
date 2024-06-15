package com.adv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1050128270851750716L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String username = req.getParameter("userName");
		String password = req.getParameter("userPass");
		if(username.equals("SinghShubham1308") && password.equals("1234567890")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
			requestDispatcher.forward(req, resp);
		}
		else {
			writer.print("username or password is incorrect");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
			requestDispatcher.include(req, resp);
		}
		writer.close();
	}
	
}
