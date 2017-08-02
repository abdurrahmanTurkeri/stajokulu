package com.stajokulu.webbasics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloToServlet
 */
@WebServlet("/ReturnHtmlServlet")
public class ReturnHtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ReturnHtmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html><title>Boylede donebilirim PS : Servlet</title><body><b style=\"color:red\">Vitaminsiz JSP </b> </body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
