package com.nri.ali;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object...");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		System.out.println("Servcing...");
		//det the content type of the reponse
		res.setContentType("text/html");
		PrintWriter pWriter = res.getWriter();
		pWriter.println("<h1>This is a servlet created using Servlet</h1>");
	    pWriter.println("<h1>Todays Date : "+new Date().toString() + "</h1>");
	}

	public void destroy() {
		System.out.println("Going to destroy servlet object");
	}
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This servlet is created by Ali ";
	}
}

