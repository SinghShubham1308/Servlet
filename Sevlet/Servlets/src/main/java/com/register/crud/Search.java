package com.register.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.util.DbConnection;

public class Search extends HttpServlet {

	private static final long serialVersionUID = -1754079903463139337L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String searchQueryString = "select * from result where rollno=?";
		try (Connection connection = DbConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(searchQueryString)) {
			out.print("<table width=50% border=1>");  
			out.print("<caption>Result:</caption>");  
			  
			ResultSet rs=preparedStatement.executeQuery();  
			/* Printing column names */  
			ResultSetMetaData rsmd=rs.getMetaData();  
			int total=rsmd.getColumnCount();  
			out.print("<tr>");  
			for(int i=1;i<=total;i++)  
			{  
			out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
			}  
			  
			out.print("</tr>");  
			              
			/* Printing result */  
			  
			while(rs.next())  
			{  
			out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+ 
			"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");  
			                  
			}  
			  
			out.print("</table>");  
			              
			}catch (Exception e2) {e2.printStackTrace();}  
			          
			finally{out.close();}  
			  
	}
}
