<%@page import="com.entity.User"%>
<%@page import="com.entity.Hostel"%>
<%@page import="com.dao.HostelDao"%>
<%@page import="com.entity.Booking"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.BookingDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User-Previous Booking</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}


</style>
</head>
<body>
	<c:if test="${empty userObj }">
		<c:redirect url="user_login.jsp"></c:redirect>
	</c:if>
	<%@include file="components/navbar.jsp"%>

	<div class="container-fulid backImg p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-9">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 fw-bold text-center text-success">Bookings List</p>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">UserName</th>
									<th scope="col">Gender</th>
									<th scope="col">Age</th>
									<th scope="col">Booking Date</th>
									<th scope="col">User Email</th>
									<th scope="col">Hostel Name</th>
									<th scope="col">Duration (in months)</th>
									<th scope="col">Status</th>

								</tr>
							</thead>
							<tbody>
								<%
								User user = (User) session.getAttribute("userObj");
								BookingDAO dao = new BookingDAO(DBConnect.getConn());
								HostelDao dao2 = new HostelDao(DBConnect.getConn());
								List<Booking> list = dao.getAllBookingByLoginUser(user.getUser_id());
								for (Booking book : list) {
									Hostel h = dao2.getHostelById(book.getHostel_id());
								%>
								<tr>
									<th><%=book.getName()%></th>
									<td><%=book.getGender()%></td>
									<td><%=book.getAge()%></td>
									<td><%=book.getBooking_date()%></td>
									<td><%=book.getEmail()%></td>
									<td><%=h.getHostel_name()%></td>
									<td><%=book.getBooking_duration()%></td>
									
									<td>
										<%
										if ("Pending".equals(book.getBooking_status())) {
										%> <a href="#" class="btn btn-sm btn-warning">Pending</a> <%
                                       } else {
                                      %> <%=book.getBooking_status()%> <%
                                        }
                                        %>
									</td>
								</tr>
								<%
								}
								%>



							</tbody>
						</table>

					</div>
				</div>
			</div>

			
		</div>
	</div>


</body>
</html>