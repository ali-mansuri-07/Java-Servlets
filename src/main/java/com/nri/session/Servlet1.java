package com.nri.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html;charset=UTF-8");
          try(PrintWriter pWriter = response.getWriter()) {
              pWriter.print("!DOCTYPE html");
              pWriter.println("<html>");
              pWriter.println("<head>");
              pWriter.println("<title> Servlet Servlet1 </title>");
              pWriter.println("</head>");
              pWriter.println("<body>");
              
              String name = request.getParameter("name");
              Cookie cookie = new Cookie("name", name);
              response.addCookie(cookie);
              pWriter.println("<h1> Hello " + name + " Welcome to my website... </h1>");
              pWriter.println("<h1><a href='Servlet2'> Go to Servlet 2 </a>  </h1>");            
              pWriter.println("</body>");
              pWriter.println("</html>");
          } catch(Exception e) {
              System.out.println(e.getMessage());
          }
          
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
