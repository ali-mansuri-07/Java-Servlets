package com.nri.ali;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method in Generic servlet");
		System.out.println("This is a Servlet created using Generic servlet");
		res.setContentType("text/html");
		PrintWriter pWriter = res.getWriter();
		pWriter.println("<h1>Hello From Generic Servlet </h1>");
		pWriter.println("<h1>Todays Date : "+new Date().toString() + "</h1>");
	}
}
