package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String name=request.getParameter("name");
		int Age=Integer.parseInt(request.getParameter("age"));
		String location=request.getParameter("location");
		writer.println("<html><body bgcolor='yellow' style='text-align:center;'>");
		writer.println("StudentName........"+name);
		writer.println("<br><br>");
		writer.println("StudentAge........"+Age);
		writer.println("<br><br>");
		writer.println("StudentLocation........"+location);
		writer.println("<br><br>");
		writer.println("Registration is succesfull.........your Id is 1234");
		writer.println("</body></html>");
		
		
		
		
	}

}
