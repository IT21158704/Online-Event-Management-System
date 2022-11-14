<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Edit Account</title>
</head>
<body>
		

<!--=======================Header Start=======================-->	
	<header>
            <div class="nav-bar">
                <div class="logo"><h3>Eventive</h3></div>
                <div class="navigation">
                    <div class="nav-items">             
                        <a href="myBooking.jsp">View Booking</a>
                 	    <a href="checkFeedback.jsp">My Feedback</a>
                        <a href="index.jsp">Log Out</a>
                    </div>
                </div>
            </div>
        </header>
<!--=======================Header End=======================-->

	
	
	<% 
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
	
	%>
	<div class="container">
		<h1>Update Details</h1>
		<div class="form flex-center">
			<form action="UpdateCustomerDetailsServlet" method="post">
				ID <input type="text" name="cusID" value="<%= id%>" readonly><br>
				Name <input type="text" name="cusName" value="<%= name%>"><br>
				Email <input type="text" name="cusEmail" value="<%= email%>"><br>
				Phone No <input type="text" name="cusPhone" value="<%= phone%>"><br>
				Username <input type="text" name="cusUsn" value="<%= uname%>"><br>
				Password <input type="text" name="cusPwd" value="<%= pwd%>"><br>
				
				<input type="submit" name="submit" value="Update My Data">
			</form>
		</div>
	</div>

</body>
</html>