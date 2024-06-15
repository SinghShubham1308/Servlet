package com.adv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3036370788225361762L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello generic servlet</b>");
		out.print("</body></html>");

	}

}
