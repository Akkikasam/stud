package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/RegServlet")
public class Filter1 implements Filter {

    
    public Filter1() {
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		int Age=Integer.parseInt(request.getParameter("age"));
		if(Age>5)
		{
			chain.doFilter(request, response);
			
			}
		else
		{
			writer.println("your small kid so wait for sometime.....");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Student.html");
			dispatcher.include(request,response);
			
			}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
