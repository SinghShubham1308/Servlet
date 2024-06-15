package com.adv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Http extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 678278179587523822L;

	/** 
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		String name=req.getParameter("name");//will return value  
		System.out.println(name);
		pw.println("Welcome to servlet "+name);  
		  
		pw.close(); 
	}

}
