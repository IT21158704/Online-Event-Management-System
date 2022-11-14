<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>My Booking</title>
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

	
	<c:forEach var="eve" items="${bknDetails}">	
		<div class="container">
			<h1>${eve.eid} Booking</h1>
			<div class="form flex-center">
				<form action="#" method="post">
					<br><br>
					Booking ID : ${eve.eid}<br><br>
					Customer ID : ${eve.cid}<br><br>
					Type : ${eve.type}<br><br>
					Date : ${eve.date}<br><br>
					Discription : ${eve.discription}<br><br>
					Venue : ${eve.venue}<br><br><br><br>
				
					
					<c:url value = "UpdateBooking.jsp" var = "updBook">
						<c:param name="eid" value = "${eve.eid}"/>
						<c:param name="cid" value = "${eve.cid}"/>
						<c:param name="type" value = "${eve.type}"/>
						<c:param name="date" value = "${eve.date}"/>
						<c:param name="discription" value = "${eve.discription}"/>
						<c:param name="venue" value = "${eve.venue}"/>
					</c:url>
					<a href="${updBook}">
						<input type="button" name="update" value="Update Booking">
					</a>
					
					<c:url value = "DeleteBooking.jsp" var = "delBook">
						<c:param name="eid" value = "${eve.eid}"/>
						<c:param name="cid" value = "${eve.cid}"/>
						<c:param name="type" value = "${eve.type}"/>
						<c:param name="date" value = "${eve.date}"/>
						<c:param name="discription" value = "${eve.discription}"/>
						<c:param name="venue" value = "${eve.venue}"/>
					</c:url>
					<a href="${delBook}">
						<input type="button" name="update" value="Delete Booking">
					</a> 
				</form>
			</div>
		</div>
	</c:forEach>
</body>
</html>