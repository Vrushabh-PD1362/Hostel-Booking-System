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

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String user_email=req.getParameter("user_email");
			String user_password=req.getParameter("user_password");
			
			HttpSession session=req.getSession();
			
			UserDao dao = new UserDao(DBConnect.getConn());
			User user = dao.userLogin(user_email, user_password);
			
			if(user!=null)
			{
				session.setAttribute("userObj", user);
				resp.sendRedirect("user_index.jsp");
			}
			else
			{
				session.setAttribute("errorMsg", "Invalid Credentials");
				resp.sendRedirect("user_login.jsp");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
