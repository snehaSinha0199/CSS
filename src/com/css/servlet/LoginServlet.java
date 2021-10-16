/*
 * package com.css.servlet;
 * 
 * import java.io.IOException; import java.io.Writer; import
 * java.util.Enumeration;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * 
 * 
 *//**
	 * Servlet implementation class LoginServlet
	 */
/*
 * @WebServlet("/login.do") public class LoginServlet extends HttpServlet {
 * private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * public LoginServlet() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void service(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { //Step1-Collect the data.
		 * String email = request.getParameter("email"); String pwd =
		 * request.getParameter("pwd"); //Step2-Process the data. String msg = "";
		 * UserService us=new UserService(); if (us.verifyUser(email, pwd)) {
		 * RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		 * rd.forward(request, response); } RequestDispatcher rd =
		 * request.getRequestDispatcher("login.jsp"); rd.forward(request, response); }
		 * 
		 * 
		 * }
		 */