package com.adv.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5764232860640873417L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    ServletConfig config=getServletConfig();  
	    Enumeration<String> e=config.getInitParameterNames();  
	          
	    String str="";  
	    while(e.hasMoreElements()){  
	    str=e.nextElement();  
	    out.print("<br>Name: "+str);  
	    out.print(" value: "+config.getInitParameter(str));  
	    }  
	          
	    out.close();  
	}  

}