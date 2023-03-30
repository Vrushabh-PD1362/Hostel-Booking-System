package com.admin.servlet;

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

@WebServlet("/addHostel")
public class AddHostel extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			String hostel_name= req.getParameter("hostel_name");
			String hostel_address= req.getParameter("hostel_address");
			String hostel_phone= req.getParameter("hostel_phone");
			String hostel_rules= req.getParameter("hostel_rules");
			String hostel_amenities= req.getParameter("hostel_amenities");
			String hostel_email= req.getParameter("hostel_email");
			String hostel_password= req.getParameter("hostel_password");
			int hostel_deposit=  Integer.parseInt(req.getParameter("hostel_deposit"));
			int hostel_rent=  Integer.parseInt(req.getParameter("hostel_rent"));
			
			Hostel h = new Hostel(hostel_name, hostel_address, hostel_phone, hostel_rules, hostel_amenities, hostel_email, hostel_password, hostel_deposit, hostel_rent);
			
			HostelDao dao = new HostelDao(DBConnect.getConn());
			
			HttpSession session = req.getSession();
			
			
			if(dao.addHostel(h))
			{
				session.setAttribute("sucMsg", "Hostel added successfully");
				resp.sendRedirect("admin/hostel.jsp");
			}
			else 
			{
				session.setAttribute("errorMsg", "Something went wrong");
				resp.sendRedirect("admin/hostel.jsp");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
