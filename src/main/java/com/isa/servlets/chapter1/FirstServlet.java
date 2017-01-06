package com.isa.servlets.chapter1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html><body>" + "<h1 align=center>HF's Chapter1 Servlet</h1><br>" + today + "</body></html>");
	}
}
