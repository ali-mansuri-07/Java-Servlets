package com.nri.ali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<h1>This is a Register servlet</h1>");
		String nameString = request.getParameter("user_name");
		String emailString = request.getParameter("user_email");
		String passString = request.getParameter("user_password");
		String genderString = request.getParameter("user_gender");
		String courseString = request.getParameter("user_course");
		String conditionString = request.getParameter("condition");
		
			if(conditionString != null && conditionString.equals("checked")) {
				pWriter.println("<h1> Name : " + nameString + "</h1>");
				pWriter.println("<h1> Email : " + emailString + "</h1>");
				pWriter.println("<h1> Password : " + passString + "</h1>");
				pWriter.println("<h1> Gender : " + genderString + "</h1>");
				pWriter.println("<h1> Course : " + courseString + "</h1>");
				
				//save to DB
				RequestDispatcher rDispatcher = request.getRequestDispatcher("success");
				rDispatcher.forward(request, response);
			}
			else {
				pWriter.println("<h1>You Have not accepted the terms and conditions</h1>");
			    RequestDispatcher rDispatcher = request.getRequestDispatcher("index.html");
			    rDispatcher.include(request, response);
			}
	}

}
