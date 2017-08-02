package com.stajokulu.clientbasic;

import java.awt.Desktop;
import java.net.URI;

public class CallAComplexHtmlServlet {
public static void main(String[] args) throws Exception {
	
	if(Desktop.isDesktopSupported())
	{
	  Desktop.getDesktop().browse(new URI("http://localhost:8080/ElementerOnWeb/ReturnComplexHtmlServlet"));
	}
}
}
