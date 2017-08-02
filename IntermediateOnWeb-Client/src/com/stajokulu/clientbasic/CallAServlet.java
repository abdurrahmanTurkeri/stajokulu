package com.stajokulu.clientbasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class CallAServlet {
public static void main(String[] args) throws Exception {
	
	    URL url = new URL("http://localhost:8080/ElementerOnWeb/HelloToServlet");
	    URLConnection conn = url.openConnection();
	    conn.setDoOutput(true);
	    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    String line;
	    String result="";
	    while ((line = rd.readLine()) != null) {
	    	result=result+line;
	    }
	    System.out.println("Sonuc :"+result);
	    rd.close();
}
}
