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
 * Servlet implementation class ForgotServlet
 */
@WebServlet("/forget.do")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService serv;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        this.serv=CssFactory.getUserServiceInstance();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String email = request.getParameter("email");
     Response result = serv.getUser(email);
     if(result.isSuccess()) {
    	 request.getSession().setAttribute("msg", "Please check your email Id.Your password is sent there.");
     }
     else {
    	 request.setAttribute("msg", result.getMessage());
 		request.setAttribute("success", "fail");
    	 RequestDispatcher rd = request.getRequestDispatcher(MessageBundle.getAllFiles(AllFiles.FORGOT_PAGE));
 		rd.forward(request, response);
     }
	}

}
