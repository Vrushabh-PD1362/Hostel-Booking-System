<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

<!-- JSP include directory    
		For Reuseability of code -->
<%@include file="components/all_css.jsp"%>


<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

<style>
body {
	background-color: #F4C2C2;
	/* Set the background color of the body element to hot pink */
}
</style>


<style>
.video-container {
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>


</head>
<body>
	<%@include file="components/navbar.jsp"%>

	<%
	Connection conn = DBConnect.getConn();
	%>
	
	<div class="video-container">

		<video width="500" height="500" autoplay muted loop>
			<source src="images/xyz.mp4" type="video/mp4">
		</video>

		<video width="500" height="500" autoplay muted loop>
			<source src="images/abc.mp4" type="video/mp4">
		</video>

		<video width="500" height="500" autoplay muted loop>
			<source src="images/guesture.mp4" type="video/mp4">
		</video>

	</div>

	

	<div class="container p-3">
		<p class="text-center fs-2">Key Features of HomeAway</p>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">

					<div class="col-md-6">
						<div class="card paint-card"">
							<div class="card-body" >
								<p class="fs-5">100% Safety</p>
								<p>Safety is our No. 1 priority</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body" >
								<p class="fs-5">Shortlist without Visit</p>
								<p>Extensive information makes it easy</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body" >
								<p class="fs-5">Avoid Brokers</p>
								<p>we directly connect you to verified owners</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Free Listing</p>
								<p>Easy listing process. Also using Whatsapp</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<img alt=" " src="images/Movein.jpg" height="350px" >
			</div>
		</div>
	</div>

	<hr>

<div class="container p-2">
	<p class="text-center fs-2">Hostels</p>
	<div class="row">
		<div class="col-md-3">
			<div class="card paint-card">
				<div class="card-body text-center" >
					<video width="100%" height="200px" autoplay muted loop>
						<source src="hostel_videos/stanza.mp4" type="video/mp4">
					
					</video>
					<p class="fw-bold fs-5 mt-2">Stanza Living</p>
					<p class="fs-7">(Gokhale Nagar, Pune)</p>
				</div>
			</div>
		</div>
	


			<div class="col-md-3">
			<div class="card paint-card">
				<div class="card-body text-center" >
					<video width="100%" height="200px" autoplay muted loop>
						<source src="hostel_videos/h22.mp4" type="video/mp4">
						
					</video>
						<p class="fw-bold fs-5">Zolo Stays</p>
						<p class="fs-7">(Shivaji Nagar, Pune)</p>
					</div>
				</div>
			</div>

				<div class="col-md-3">
			<div class="card paint-card">
				<div class="card-body text-center" >
					<video width="100%" height="200px" autoplay muted loop>
						<source src="hostel_videos/h2.mp4" type="video/mp4">
						
					</video>
						<p class="fw-bold fs-5">Hostel World</p>
						<p class="fs-7">(Deccan, Pune)</p>
					</div>
				</div>
			</div>


					<div class="col-md-3">
			<div class="card paint-card">
				<div class="card-body text-center" >
					<video width="100%" height="200px" autoplay muted loop>
						<source src="hostel_videos/r3.mp4" type="video/mp4">
					</video>
						<p class="fw-bold fs-5">Co-Living</p>
						<p class="fs-7">(Model Colony, Pune)</p>
					</div>
				</div>
			</div>

		</div>
	</div>

	<%@include file="components/footer.jsp"%>

</body>
</html>