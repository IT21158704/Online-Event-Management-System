<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<link rel="stylesheet" href="assests/css/adminlogin.css">
        <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Delete Booking</title>
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
	String eid = request.getParameter("eid");
	String cid = request.getParameter("cid");
	String type = request.getParameter("type");
	String date = request.getParameter("date");
	String discription = request.getParameter("discription");	
	String venue = request.getParameter("venue");	
	%>
	
	<div class="container">
		<h1>Delete Event</h1>
		<div class="form flex-center">
			<form action="deleteBookingServlet" method="post">
				Customer Id : <input type="text" name="cid" Value="<%= cid%>" readonly>
				Booking Id : <input type="text" name="eid" Value="<%= eid%>" readonly>
				Type : <input type="text" name="type" Value="<%= type%>" readonly>
				Date : <input type="text" name="date" Value="<%= date%>" readonly>
				Discription : <input type="text" name="discription" Value="<%= discription%>" readonly>
				Venue : <input type="text" name="venue" Value="<%= venue%>" readonly>
				<input type="submit" name="submit" value="Delete Booking">
			</form>
		</div>
	</div>

</body>
</html>