<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<link rel="stylesheet" href="assests/css/adminlogin.css">
        <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Events</title>
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
		<div class="form flex-center">
			<h2>Search Event</h2>
			<form action="viewEventServlet" method = "post"><br><br>

					Event Name : <input type="text" name="ename" ><br>

				<input type="submit" name="submit" value="Search" class="sub-btn">
			</form>
		</div>
	</div>

</body>
</html>