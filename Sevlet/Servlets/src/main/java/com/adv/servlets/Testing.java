package com.adv.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Testing implements Servlet{
	
	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getting the config method");
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this is the getinfo method";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside the service method");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("THe service method is running in normal "+new Date().toString());
		
	}

}
