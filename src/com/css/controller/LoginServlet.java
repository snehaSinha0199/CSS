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
import com.css.util.MessageBundle;
import com.css.vo.Register;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Register user;
	private UserService serv;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        this.user=CssFactory.getRegisterInstance();
        this.serv=CssFactory.getUserServiceInstance();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	user.setEmail(request.getParameter("email"));
	user.setPassword(request.getParameter("pwd"));
	Response result = serv.verifyUser(user);
	if(result.isSuccess()) {
		request.getSession().setAttribute("firstname","Hii,"+result.getData().toUpperCase());
		RequestDispatcher rd = request.getRequestDispatcher(MessageBundle.getAllFiles(AllFiles.TEST_PAGE));
		rd.forward(request, response);
	}
	else {
		request.setAttribute("msg", result.getMessage());
		request.setAttribute("success", "fail");
		RequestDispatcher rd = request.getRequestDispatcher(MessageBundle.getAllFiles(AllFiles.LOGIN_PAGE));
		rd.forward(request, response);
	}
	}

}
