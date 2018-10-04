package com.cubic.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cubic.project.DAO.AdminDAO;
import com.cubic.project.beans.AdminBean;

public class AdminServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String aname=req.getParameter("aname");
		String apass=req.getParameter("apass");
		resp.setContentType("aname");
		PrintWriter out=resp.getWriter();
		System.out.println("Method Called");
		AdminBean ab=new AdminBean(aname, apass);
		System.out.println("Bean Exicuted");
		boolean b=AdminDAO.login(ab);
		System.out.println("DAO Exicuted Successfully");
		System.out.println("The Result is "+b);
		if(b==true) {
			resp.sendRedirect("StudentRegistration.html");
		}else
			out.println("Invalid Admin Details");
		RequestDispatcher rd=req.getRequestDispatcher("adminlogin.html");
		rd.include(req, resp);
	}
}
