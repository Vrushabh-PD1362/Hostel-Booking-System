<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>


<nav class="navbar navbar-expand" style="background-color: #ADD8E6;">

	<div class="container-fluid">
		<a class="navbar-brand d-flex align-items-center " href="index.jsp"><img src="images/162.png" alt="" width="250" height="50"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				<c:if test="${empty userObj}">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="admin_login.jsp" style="font-size: 1.5rem;">
							<i class="fa-solid fa-right-to-bracket"></i> Admin
					</a></li>


					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page" href="user_login.jsp"  style="font-size: 1.5rem;"><i
							class="fa-solid fa-circle-user"></i> User</a></li>

					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page"
						href="hosteladmin_login.jsp" style="font-size: 1.5rem;"> <i class="fa-solid fa-user-tie"></i>
							Hostel-Admin
					</a></li>
				</c:if>



				<c:if test="${not empty userObj}">
					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page" href="user_new_booking.jsp"  style="font-size: 1.5rem;">
							<i class="fa-solid fa-user"></i> New Booking
					</a></li>
					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page" href="user_previous_booking.jsp"  style="font-size: 1.5rem;">
							<i class="fa-solid fa-user"></i> Previous Bookings
					</a></li>

					<li class="nav-item dropdown"  style="margin-left: 2rem;"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">${userObj.user_name }</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							
							<li><a class="dropdown-item" href="userLogout">logout</a></li>
						</ul></li>
						
						
						
						
						
				</c:if>

			</ul>
		</div>
	</div>
</nav>

