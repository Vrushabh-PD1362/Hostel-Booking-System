package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String user_name=req.getParameter("user_name");
			String user_email=req.getParameter("user_email");
			String user_password=req.getParameter("user_password");
			

			User u = new User(user_name, user_email, user_password);

			UserDao dao = new UserDao(DBConnect.getConn());

			HttpSession session = req.getSession();


			boolean f = dao.userRegister(u);

			if(f)
			{
				session.setAttribute("sucMsg", "Registered Successfully\nPlease log in to continue");
				resp.sendRedirect("user_login.jsp");
			}
			else
			{
				session.setAttribute("errorMsg", "Something went wrong");
				resp.sendRedirect("signup.jsp");
			}

		}catch (Exception e) {

			e.printStackTrace();
		}








	}



}
