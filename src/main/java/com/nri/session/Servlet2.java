package com.nri.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter pWriter = response.getWriter()) {
                pWriter.print("!DOCTYPE html");
                pWriter.println("<html>");
                pWriter.println("<head>");
                pWriter.println("<title> Servlet Servlet2 </title>");
                pWriter.println("</head>");
                pWriter.println("<body>");
                
                //getting cookies
                Cookie[] cookies = request.getCookies();
                boolean f = false;
                String nameString = "";
                if(cookies == null) {
                	pWriter.println("<h1>You are new user go to hoome and register </h1>");
                	return;
                }
                else {
                	for(Cookie c : cookies) {
                		String tnameString = c.getName();
                		if(tnameString.equals("name")) {
                			f = true;
                			nameString = c.getValue();
                		}
                	}
                }
                if(f) {
	                pWriter.println("<h1> Hello " + nameString + " Welcome back to my website... </h1>");
	                pWriter.println("<h1>Thankyou</h1>"); 
                }
                else {
                	pWriter.println("<h1>You are new user go to hoome and register </h1>");
                }
                pWriter.println("</body>");
                pWriter.println("</html>");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
