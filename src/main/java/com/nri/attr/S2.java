package com.nri.attr;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
public class S2 extends HttpServlet {
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
                    PrintWriter outPrintWriter = response.getWriter();
                    outPrintWriter.println("<!DOCTYPE html>");
                    outPrintWriter.println("<html>");
                    outPrintWriter.println("<head>");
                    outPrintWriter.println("<title>Servlet S2</title>");
                    outPrintWriter.println("</head>");
                    outPrintWriter.println("<body>");
                //    outPrintWriter.println("<h1>Servlet S2 at" + request.getContextPath() + "</h1>");
                    
                    String n1 = request.getParameter("n1");
                    String n2 = request.getParameter("n2");
                    
                    int nn1 = Integer.parseInt(n1);
                    int nn2 = Integer.parseInt(n2);
                    
                    
                    int p = nn1 * nn2;
                    
                    //get attribute from the request object
                    int sum = (int)request.getAttribute("sum");
     
                    outPrintWriter.println("<h1>");
                    outPrintWriter.println("Sum is = " + sum);
                    outPrintWriter.println("Product is = " + p);
                    outPrintWriter.println("</h1>");
 
                    
                    outPrintWriter.println("</body>");
                    outPrintWriter.println("</html>");

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
