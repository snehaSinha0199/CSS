package com.css.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckAnswers {
	public static int get(HttpServletRequest request, HttpServletResponse response){
		int count=0;
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");
		String yes="yes";
		if(q1.equals(yes)) {
			count++;
		}
		if(q2.equals(yes)) {
			count++;
		}
		if(q3.equals(yes)) {
			count++;
		}
		if(q4.equals(yes)) {
			count++;
		}
		if(q5.equals(yes)) {
			count++;
		}
		return count;
	}
}
