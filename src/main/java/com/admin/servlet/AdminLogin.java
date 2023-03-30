package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;

@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String admin_email=req.getParameter("admin_email");
			String admin_password=req.getParameter("admin_password");
			
			HttpSession session=req.getSession();
			
			if("admin@gmail.com".equals(admin_email) && "admin@123".equals(admin_password))
			{
				session.setAttribute("adminObj", new User());
				resp.sendRedirect("admin/index.jsp");
			}
			else
			{
				session.setAttribute("errorMsg", "Invalid Credentials");
				resp.sendRedirect("admin_login.jsp");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
