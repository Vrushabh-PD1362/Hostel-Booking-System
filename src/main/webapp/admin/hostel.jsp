<%@page import="com.entity.Hostel"%>
<%@page import="com.dao.HostelDao"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hostel</title>


<%@include file="../components/all_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

<style>
		#bg-video {
			position: fixed;
			right: 0;
			bottom: 0;
			min-width: 100%;
			min-height: 100%;
			z-index: -1;
		}
</style>


</head>
<body>
	<%@include file="admin_navbar.jsp"%>
	
	
	<div class="container-fluid p-3">
		<div class="row">

			<div class="col-md-6 offset-md-1">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Add Hostel</p>
						
						<c:if test="${not empty errorMsg}">
							<p class="fs-3 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						
						<c:if test="${not empty sucMsg}">
							<div class="fs-3 text-center text-success" role="alert">${sucMsg}</div>
							<c:remove var="sucMsg" scope="session" />
						</c:if>
						
						
						
						<form action="../addHostel" method="post">
							<div class="mb-2">
								<label class="form-label">Hostel Name</label> <input type="text"
									required name="hostel_name" class="form-control">
							</div>
							
							<div class="mb-2">
								<label class="form-label">Hostel Address</label> <input type="text"
									required name="hostel_address" class="form-control">
							</div>

							<div class="mb-2">
								<label class="form-label">Hostel Phone</label> <input type="text"
									required name="hostel_phone" class="form-control">
							</div>
							
							<div class="mb-2">
								<label class="form-label">Hostel Rules</label> <input type="text"
									required name="hostel_rules" class="form-control">
							</div>
							
							<div class="mb-2">
								<label class="form-label">Hostel Amenities</label> <input type="text"
									required name="hostel_amenities" class="form-control">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Hostel Email</label> <input type="text"
									required name="hostel_email" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Hostel Password</label> <input type="text"
									required name="hostel_password" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Hostel Deposit</label> <input type="text"
									required name="hostel_deposit" class="form-control">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Hostel Rent</label> <input type="text"
									required name="hostel_rent" class="form-control">
							</div>
							
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>