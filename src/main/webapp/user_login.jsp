<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

<%@include file="components/all_css.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

<style>
body {
	background-color: lightpink;
	/* Set the background color of the body element to hot pink */
}
</style>

</head>


<body>
	<%@include file="components/navbar.jsp"%>

	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">User Login</p>


						<c:if test="${not empty sucMsg }">
							<p class="text-center text-success fs-3">${sucMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg }">
							<p class="text-center text-danger fs-3">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>

						<form action="userLogin" method="post">
							<div class="mb-3">
								<label class="form-label"><i
									class="fa-sharp fa-solid fa-envelope" style="font-size: 18px;"></i>
									Email</label><input required name="user_email" type="email"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label"><i
									class="fa-sharp fa-solid fa-lock" style="font-size: 18px;"></i>
									Password</label> <input required name="user_password" type="password"
									class="form-control">
							</div>

							<button type="submit" class="btn bg-success text-white col-md-12">Login</button>
							<br> <br> Don't have an account?<a href="signup.jsp"
								class="text-decoration-none"> create one</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>