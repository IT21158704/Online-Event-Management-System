<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		String id = request.getParameter("fid");
		String cid = request.getParameter("cid");
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");	
	%>
	
	<div class="container">
		<h1>Delete Feedback</h1>
		<div class="form flex-center">
			<form action="deleteFeedbackServlet" method="post">
				ID <input type="text" name="cID" value="<%= id%>" readonly><br>
				CID <input type="text" name="cusID" value="<%= cid%>" readonly><br>
				Name <input type="text" name="cusName" value="<%= name%>" readonly><br>
				Feedback <input type="text" name="cusFeedback" value="<%= feedback%>" readonly><br>
				
				<input type="submit" name="submit" value="Delete Feedback">
			</form>
		</div>
	</div>

</body>
</html>