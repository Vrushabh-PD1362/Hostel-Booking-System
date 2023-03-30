<%@page import="com.entity.Hostel"%>
<%@page import="com.dao.HostelDao"%>
<%@page import="com.entity.RoomType"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.RoomTypeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hostel List</title>
<%@include file="../components/all_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="admin_navbar.jsp"%>
	
	<div class="container-fluid p-3">
		<div class="row">


			<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Hostel Details</p>
						
						<c:if test="${not empty errorMsg}">
							<p class="fs-3 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						
						<c:if test="${not empty sucMsg}">
							<div class="fs-3 text-center text-success" role="alert">${sucMsg}</div>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Hostel Name</th>
									<th scope="col">Hostel Address</th>
									<th scope="col">Hostel Phone</th>
									<th scope="col">Hostel Rules</th>
									<th scope="col">Hostel Amenities</th>
									<th scope="col">Hostel Email</th>
									<th scope="col">Hostel Password</th>
									<th scope="col">Hostel Deposit</th>
									<th scope="col">Hostel Rent</th>
									
								</tr>
							</thead>
							
							<tbody>
								<%
								HostelDao dao2 = new HostelDao(DBConnect.getConn());
								List<Hostel> list2 = dao2.getAllHostel();
								for (Hostel h : list2) {
								%>
								<tr>
									<td><%=h.getHostel_name()%></td>
									<td><%=h.getHostel_address()%></td>
									<td><%=h.getHostel_phone()%></td>
									<td><%=h.getHostel_rules()%></td>
									<td><%=h.getHostel_amenities()%></td>
									<td><%=h.getHostel_email()%></td>
									<td><%=h.getHostel_password()%></td>
									<td><%=h.getHostel_deposit()%></td>
									<td><%=h.getHostel_rent()%></td>
									
									
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