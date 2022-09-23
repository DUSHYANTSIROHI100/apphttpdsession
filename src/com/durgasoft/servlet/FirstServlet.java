package com.durgasoft.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String uage=request.getParameter("uage");
		Cookie c1=new Cookie("uname", uname);
		Cookie c2=new Cookie("uage", uage);
		response.addCookie(c1);
		response.addCookie(c2);
		RequestDispatcher rd=request.getRequestDispatcher("form2.html");
		rd.forward(request, response);
		 }
		 }

