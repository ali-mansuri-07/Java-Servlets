package com.nri.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {
    // private static final long serialVersionUID = 1L;
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
 
    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                response.setContentType("text/html;charset=UTF-8");
                try {
                //    outPrintWriter.println("<h1>Servlet S1 at" + request.getContextPath() + "</h1>");
                    
                    String n1 = request.getParameter("n1");
                    String n2 = request.getParameter("n2");
                    
                    System.out.println(n1 + " " +n2);
                    
                    int nn1 = Integer.parseInt(n1);
                    
                    
                    int nn2 = Integer.parseInt(n2);
                    //add 
                    int s = nn1 + nn2;
                    
                    //attribute
                    request.setAttribute("sum", s);
                    System.out.println("T1");
                    
                    //request.....request dispatcher 
                    RequestDispatcher rd = request.getRequestDispatcher("S2");
                    
                    rd.forward(request, response);
                    System.out.println("T2");
                    

                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        System.out.println("Hello World");
        processRequest(request, response);
    }

    

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return "short description";
    }
    

}