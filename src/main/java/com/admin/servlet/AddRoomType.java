package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RoomTypeDao;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/addRoomType")
public class AddRoomType extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String roomtype_name = req.getParameter("roomtype_name");

		RoomTypeDao dao = new RoomTypeDao(DBConnect.getConn());
		boolean f = dao.addRoomType(roomtype_name);

		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("sucMsg", "Room type added");
			resp.sendRedirect("admin/index.jsp");
		} else {
			session.setAttribute("errorMsg", "something went wrong");
			resp.sendRedirect("admin/index.jsp");
		}

	}

}
