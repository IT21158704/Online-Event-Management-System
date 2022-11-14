<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Your Feedback</title>
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

	
	<c:forEach var="fbk" items="${fbkDetails}">	
	
			<div class="container">
		<h1>Your Feedback</h1>
		<div class="form flex-center">
			<form action="UpdateCustomerDetailsServlet" method="post">
				<br><br>
				Feedback ID : ${fbk.id}<br><br>
				Customer ID : ${fbk.cid}<br><br>
				Name : ${fbk.name}<br><br>
				Feedback :<br> ${fbk.feedback} <br><br><br><br>

			
			<c:url value = "UpdateFeedback.jsp" var = "cusFeedback">
					<c:param name="fid" value = "${fbk.id}"/>
					<c:param name="cid" value = "${fbk.cid}"/>
					<c:param name="name" value = "${fbk.name}"/>
					<c:param name="feedback" value = "${fbk.feedback}"/>
				</c:url>
				<a href="${cusFeedback}">
				<input type="button" name="update" value="Update Feedback">
				</a>
				
				<c:url value = "DeleteFeedback.jsp" var = "feeDelete">
					<c:param name="fid" value = "${fbk.id}"/>
					<c:param name="cid" value = "${fbk.cid}"/>
					<c:param name="name" value = "${fbk.name}"/>
					<c:param name="feedback" value = "${fbk.feedback}"/>
				</c:url>
				<a href="${feeDelete}">
				<input type="button" name="delete" value="Delete My Feedback">
				</a>
				
				</form>
			</div>
		</div>
		</c:forEach>
	</body>
</html>