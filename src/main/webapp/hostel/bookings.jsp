<%@page import="com.entity.Booking"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.BookingDAO"%>
<%@page import="com.entity.Hostel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="../components/all_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>

	<%@include file="hosteladmin_navbar.jsp"%>
	<div class="container p-3">
		<div class="row">

			<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Booking Details</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-4 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty succMsg}">
							<p class=" fs-4 text-center text-success">${succMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>

						<table class="table">
							<thead>
								<tr>
									<th scope="col">User Name</th>
									<th scope="col">Gender</th>
									<th scope="col">Age</th>
									<th scope="col">Booking Date</th>
									<th scope="col">User Email</th>
									<th scope="col">Hostel Name</th>
									<th scope="col">Duration (in months)</th>
									<th scope="col">Status</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								Hostel h = (Hostel) session.getAttribute("hostelObj");
								BookingDAO dao = new BookingDAO(DBConnect.getConn());
								List<Booking> list = dao.getAllBookingByHostelLogin(h.getHostel_id());
								for (Booking book : list) {
								%>
								<tr>
								
									<th><%=book.getName()%></th>
									<td><%=book.getGender()%></td>
									<td><%=book.getAge()%></td>
									<td><%=book.getBooking_date()%></td>
									<td><%=book.getEmail()%></td>
									<td><%=h.getHostel_name()%></td>
									<td><%=book.getBooking_duration()%></td>
								
								
								
								
								
									<td><%=book.getBooking_status()%></td>
									<td>
										<%
										if ("Pending".equals(book.getBooking_status())) {
										%> 
										<a href="comment.jsp?id=<%=book.getHostel_id()%>"
										class="btn btn-success btn-sm">Comment</a>
										 <%
										 } else {
										 %> 
										 <a href="#" class="btn btn-success btn-sm disabled">Comment</a> 
										 <%
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