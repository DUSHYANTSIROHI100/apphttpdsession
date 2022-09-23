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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uqual=request.getParameter("uqual");
		String udesig=request.getParameter("udesig");
		Cookie c1=new Cookie("uqual", uqual);
		Cookie c2=new Cookie("udesign", udesig);
		response.addCookie(c1);
		response.addCookie(c2);
		RequestDispatcher rd=request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
		}
		}

	
