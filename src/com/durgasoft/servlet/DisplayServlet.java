package com.durgasoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		Cookie[] cookies=request.getCookies();
		String uname=cookies[0].getValue();
		String uage=cookies[1].getValue();
		String uqual=cookies[2].getValue();
		String udesig=cookies[3].getValue();
		out.println("<html>");
		out.println("<body bgcolor='lightgreen'>");
		out.println("<center><br><br>");
		out.println("<table bgcolor='lightyellow'>");
		out.println("<tr><td colspan='2'><center><b><font size='5' color='red'><u>Registration Details</u></font></b></center></td></tr>");
		out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
		out.println("<tr><td>User Age</td><td>"+uage+"</td></tr>");
		out.println("<tr><td>Qualification</td><td>"+uqual+"</td></tr>");
		out.println("<tr><td>Designation</td><td>"+udesig+"</td></tr>");
		out.println("<tr><td>Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>Mobile</td><td>"+mobile+"</td></tr>");
		out.println("<tr><td>Status</td><td>Success</td></tr>");
		out.println("</table></center>");
		out.println("</body>");
		out.println("</html>");
		}
		}

