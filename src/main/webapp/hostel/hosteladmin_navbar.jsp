<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>


<nav class="navbar navbar-expand" style="background-color: #ADD8E6;">

	<div class="container-fluid">
		<a class="navbar-brand d-flex align-items-center " href="index.jsp"><img src="../images/162.png" alt="" width="250" height="50"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">


				
					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page" href="../index.jsp"  style="font-size: 1.5rem;">
							<i class="fa-solid fa-user"></i> Home 
					</a></li>
					<li class="nav-item" style="margin-left: 2rem;"><a
						class="nav-link active" aria-current="page" href="bookings.jsp"  style="font-size: 1.5rem;">
							<i class="fa-solid fa-user"></i> New Bookings
					</a></li>

					<li class="nav-item dropdown"  style="margin-left: 2rem;"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">${hostelObj.hostel_name }</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							
							<li><a class="dropdown-item" href="../hostelLogout">logout</a></li>
						</ul></li>
						

			</ul>
		</div>
	</div>
</nav>

