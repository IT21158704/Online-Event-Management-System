<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<link rel="stylesheet" href="assests/css/adminlogin.css">
    <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Add Event</title>
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
	<h1>Add Event</h1>
		<div class="form flex-center">
			<form action="insertEventServlet" method = "post">
				Event Id : <input type="text" name="id">
				Event Name : <input type="text" name="name">
				Discription : <input type="text" name="discription">
				Venue : <input type="text" name="venue">
				Price : <input type="text" name="price">
				<input type="submit" name="submit" value="Add to System"><input type="reset" value="Reset">
			</form>
		</div>
	</div>

</body>
</html>