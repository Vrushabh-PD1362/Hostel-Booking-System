package com.hostel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.HostelDao;
import com.db.DBConnect;
import com.entity.Hostel;

@WebServlet("/hostelLogin")
public class HostelLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String hostel_email = req.getParameter("hostel_email");
		String hostel_password = req.getParameter("hostel_password");

		HttpSession session = req.getSession();

		HostelDao dao = new HostelDao(DBConnect.getConn());
		Hostel hostel = dao.login(hostel_email, hostel_password);

		if (hostel != null) {
			session.setAttribute("hostelObj", hostel);
			resp.sendRedirect("hostel/index.jsp");
		} else {
			session.setAttribute("errorMsg", "Invalid email & password");
			resp.sendRedirect("hostel_login.jsp");
		}

	}

}
