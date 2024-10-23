package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out =response.getWriter();
	out.print("hello");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		String user =request.getParameter("Uname");
		String p =request.getParameter("Pwd");
		if(user.equals("batch75") && p.equals("1234"))
		{
			out.print("<h2>Welcome:"+user+"</h2>");
			
		}
		else
		{
			out.print("Enter correct Username and Password");
		}
		
	}
}
