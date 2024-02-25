package com.nri.ali;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("This is get method");
		res.setContentType("text/html");
		PrintWriter pWriter = res.getWriter();
		pWriter.print("<h1>This is a Third servlet using HttpServlet </h1>");
		pWriter.println("<h1>Todays Date : "+new Date().toString() + "</h1>");
	}
}
