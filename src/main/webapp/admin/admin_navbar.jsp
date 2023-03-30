<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<nav class="navbar navbar-expand" style="background-color: #0A2463;">

	<div class="container-fluid">
		<a class="navbar-brand d-flex align-items-center " href="#"><img
			src="../images/162.png" alt="" width="250" height="50"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				<li class="nav-item"  style="margin-right: 2rem;"><a class="nav-link active"
					aria-current="page" href="../index.jsp"
					style="font-size: 1.5rem;">  Home
				</a></li>


				<li class="nav-item"  style="margin-right: 2rem;"><a class="nav-link active"
					aria-current="page" href="hostel.jsp"
					style="font-size: 1.5rem;">  Add Hostel
				</a></li>
				
				
				
				<li class="nav-item"  style="margin-right: 2rem;"><a class="nav-link active"
					aria-current="page" href="hostel_list.jsp"
					style="font-size: 1.5rem;">  Hostel List
				</a></li>

			</ul>


			<form class="d-flex">
				<div class="dropdown">
					<button class="btn btn-light dropdown-toggle" type="button"
						id="dropdownMenuButton1" data-bs-toggle="dropdown"
						aria-expanded="false">Admin</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
						<li><a class="dropdown-item" href="../adminLogout">logout</a></li>
					</ul>
				</div>
			</form>
		</div>
	</div>
</nav>

