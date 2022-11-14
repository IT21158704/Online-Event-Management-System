<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
    <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Feedback</title>
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
	<h1>Feedback</h1>
		<div class="form flex-center">
				
			<form action="insertFeedbackServlet" method = "post">
				<% 
					String id = request.getParameter("id");
					String name = request.getParameter("name");
				%>
				Customer ID : <input type="text" name="id" Value="<%= id%>" readonly>
				Name : <input type="text" name="name" Value="<%= name%>" >
				Your Feedback : <input type="textarea" placeholder="Enter your feedback"  name="feedback">
				<input type="submit" name="submit" value="Submit Feedback">
			</form>
		</div>
	</div>
</body>
</html>