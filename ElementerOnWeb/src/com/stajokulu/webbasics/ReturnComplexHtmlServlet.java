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
@WebServlet("/ReturnComplexHtmlServlet")
public class ReturnComplexHtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ReturnComplexHtmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("<form action='http://localhost:8080/ElementerOnWeb/ReturnComplexHtmlServlet' method='POST'>\r\n" + 
				"  <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\r\n" + 
				"  <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\r\n" + 
				"  <input type=\"radio\" name=\"gender\" value=\"other\"> Other\r\n" + 
				"  <input type=\"submit\" name=\"post\" value=\"Kaydet\"/> \r\n" + 
				"</form>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
