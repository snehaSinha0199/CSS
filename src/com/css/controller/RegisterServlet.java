package com.css.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.css.constant.AllFiles;
import com.css.factory.CssFactory;
import com.css.response.Response;
import com.css.service.UserService;
import com.css.service.serviceimpl.UserServiceImpl;
import com.css.util.MessageBundle;
import com.css.vo.Register;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Register user;
	private UserService serv;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		this.user = CssFactory.getRegisterInstance();
		this.serv = CssFactory.getUserServiceInstance();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		user.setFirstName(request.getParameter("firstname"));
		user.setLastName(request.getParameter("lastname"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(Long.valueOf(request.getParameter("phone")));
		user.setDob(request.getParameter("dob"));
		user.setGender(request.getParameter("gender"));
		user.setState(request.getParameter("state"));
		user.setPassword(request.getParameter("pwd"));
		user.setConfirmPassword(request.getParameter("password"));
		Response result = serv.addUser(user);
		request.setAttribute("message", result.getMessage());
		request.setAttribute("isSuccess", result.isSuccess());
		RequestDispatcher rd = request.getRequestDispatcher(MessageBundle.getAllFiles(AllFiles.LOGIN_PAGE));
		rd.forward(request, response);

	}

}
