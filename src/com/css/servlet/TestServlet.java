/*
 * package com.css.servlet;
 * 
 * import java.io.IOException; import java.io.PrintWriter; import
 * java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.SQLException;
 * 
 * import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.css.util.JdbcUtil;
 * 
 *//**
	 * Servlet implementation class TestServlet
	 */
/*
 * 
 * @WebServlet("/test.do") public class TestServlet extends HttpServlet {
 * private static final long serialVersionUID = 1L;
 * 
 *//**
	 * @see HttpServlet#HttpServlet()
	 */
/*
 * 
 * public TestServlet() { super(); // TODO Auto-generated constructor stub }
 * 
 *//**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * 
		 * protected void service(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { int validate =
		 * CheckAnswers.get(request, response);
		 * request.getSession().setAttribute("validate",validate); if(validate>=3) {
		 * request.getSession().setAttribute("status","suspect");
		 * 
		 * } else { request.getSession().setAttribute("status","notsuspect"); }
		 * 
		 * request.getRequestDispatcher("report.jsp").forward(request, response); } }
		 * 
		 */