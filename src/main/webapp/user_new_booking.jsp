<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.HostelDao"%>

<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<%@page import="com.entity.Hostel"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Appointment</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.3);
}


</style>
</head>
<body>
	<%@include file="components/navbar.jsp"%>

	<div class="container-fulid backImg p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-6 p-5">
				<img alt="" src="img/doct.jpg">
			</div>

			<div class="col-md-6">
				<div class="card paint-card">
					<div class="card-body">
						<p class="text-center fs-3">User Booking</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-4 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
							
						</c:if>
						<c:if test="${not empty sucMsg}">
							<p class=" fs-4 text-center text-success">${sucMsg}</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						
						<form class="row g-3" action="bookingServlet" method="post">

							<input type="hidden" name="user_id" value="${userObj.user_id }">

							<div class="col-md-6">
								<label  class="form-label">User Name</label> <input
									type="text" class="form-control" required name="name">
							</div>

							<div class="col-md-6">
								<label>Gender</label> <select class="form-control" required name="gender"
									>
									<option value="male">Male</option>
									<option value="female">Female</option>
								</select>
							</div>

							
							
							<div class="col-md-6">
								<label class="form-label">Age</label> <input type="text"
									required name="age" class="form-control">
							</div>

							<div class="col-md-6">
								<label for="inputEmail4" class="form-label">Booking Date
								</label> <input type="date" class="form-control" required
									name="booking_date">
							</div>

							<div class="col-md-6">
								<label class="form-label">User Email</label> <input
									required type="email" class="form-control" required name="email">
							</div>

								<div class="col-md-6">
								<label class="form-label">Hostel Name</label> <select
									required class="form-control" required name="hostel_name">
									<option value="">--select--</option>

									<%
									HostelDao dao = new HostelDao(DBConnect.getConn());
									List<Hostel> list = dao.getAllHostel();
									for (Hostel h : list) {
									%>
									<option value="<%=h.getHostel_id()%>"><%=h.getHostel_name()%>
									</option>
									<%
									}
									%>

								</select>
							</div>
							
							<div class="col-md-6">
								<label class="form-label">Durations (in months)</label> <input
									required type="text" class="form-control" required name="booking_duration">
							</div>


							<div class="col-md-6">
								<label class="form-label">User Address</label> <input
									required type="text" class="form-control" required name="address">
							</div>
							
							<div class="col-md-6">
								<label class="form-label">User Phone</label> <input
									required type="text" class="form-control"
									required name="phone">
							</div>
							
							
							
							<c:if test="${not empty userObj }">
								<button class="col-md-6 offset-md-3 btn btn-success">Submit</button>
							</c:if>
							
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
	<%@include file="components/footer.jsp"%>

</body>
</html>