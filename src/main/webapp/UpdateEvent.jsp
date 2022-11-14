<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Update Event</title>
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
		String discription = request.getParameter("discription");
		String venue = request.getParameter("venue");
		String price = request.getParameter("price");	
	%>
	
	<div class="container">
		<h1>Update Event</h1>
		<div class="form flex-center">
			<form action="updateEventServlet" method="post">
				ID <input type="text" name="id" value="<%= id%>" readonly><br>
				Name <input type="text" name="name" value="<%= name%>" readonly><br>
				Discription <input type="text" name="discription" value="<%= discription%>"><br>
				Venue <input type="text" name="venue" value="<%= venue%>"><br>
				Price <input type="text" name="price" value="<%= price%>"><br>
				
				<input type="submit" name="submit" value="Update Event">
			</form>
		</div>
	</div>

</body>
</html>