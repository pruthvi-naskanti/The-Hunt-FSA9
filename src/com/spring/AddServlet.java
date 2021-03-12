package com.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		System.out.println(k);
		
//		req.setAttribute("k", k); //request dispatcher
		
//		res.sendRedirect("sq?k="+k); //URL rewriting
		
//		RequestDispatcher rd = req.getRequestDispatcher("/sq");
//		rd.forward(req, res);
		
		
//		HttpSession session = req.getSession(); // Flipkark add to cart
//		session.setAttribute("k",k); //passing data into session obj
		
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		
		
		res.sendRedirect("sq");
		
		
//		PrintWriter out = res.getWriter();
//
//		out.println("Result is "+k);
		
	}


}
