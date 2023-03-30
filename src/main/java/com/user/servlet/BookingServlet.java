package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookingDAO;
import com.db.DBConnect;
import com.entity.Booking;

@WebServlet("/bookingServlet")
public class BookingServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int user_id = Integer.parseInt(req.getParameter("user_id"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String booking_date = req.getParameter("booking_date");
		String email = req.getParameter("email");
		int hostel_id = Integer.parseInt(req.getParameter("hostel_id"));
		String booking_duration = req.getParameter("booking_duration");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		
	
		Booking book = new Booking(user_id, name, gender, age, booking_date,
				email, hostel_id, booking_duration, address,
				 "Pending", phone);

		BookingDAO dao = new BookingDAO(DBConnect.getConn());
		HttpSession session = req.getSession();

		if (dao.addBooking(book)) {
			session.setAttribute("sucMsg", "Booking added Sucessfully");
			resp.sendRedirect("user_previous_booking.jsp");
		} else {
			session.setAttribute("errorMsg", "Something went wrong ");
			resp.sendRedirect("user_new_booking.jsp");
		}

	}

}