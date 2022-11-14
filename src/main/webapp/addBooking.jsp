<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" href="assests/css/adminlogin.css">
    <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Add Booking</title>
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

	<div class="container">
	<h1>Add Booking</h1>
		<div class="form flex-center">
			<form action="addBookingServlet" method = "post">
				<% 
					String id = request.getParameter("id");
				%>
				Customer Id : <input type="text" name="cid" Value="<%= id%>" readonly>
				Event Id : <input type="text" name="eid">
				Type : <input type="text" name="type">
				Date : <input type="text" name="date">
				Discription : <input type="text" name="discription">
				Venue : <input type="text" name="venue">
				<input type="submit" name="submit" value="Book Now"><input type="reset" value="Reset">
			</form>
		</div>
	</div>

</body>
</html>