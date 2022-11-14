<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
	<link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title><c:forEach var="eve" items="${eveDetails}">${eve.name}</c:forEach></title>
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

	
	<c:forEach var="eve" items="${eveDetails}">	
		<div class="container">
			<h1>${eve.name}</h1>
			<div class="form flex-center">
				<form action="#" method="post">
					<br><br>
					Event ID : ${eve.id}<br><br>
					Name : ${eve.name}<br><br>
					Discription : ${eve.discription}<br><br>
					Venue : ${eve.venue} <br><br>
					Price : Rs ${eve.price}/=<br><br><br><br>
					
				<c:url value = "UpdateEvent.jsp" var = "updEvent">
					<c:param name="id" value = "${eve.id}"/>
					<c:param name="name" value = "${eve.name}"/>
					<c:param name="discription" value = "${eve.discription}"/>
					<c:param name="venue" value = "${eve.venue}"/>
					<c:param name="price" value = "${eve.price}"/>
				</c:url>
				<a href="${updEvent}">
					<input type="button" name="update" value="Update Event">
				</a>
				
				<c:url value = "DeleteEvent.jsp" var = "delEvent">
					<c:param name="id" value = "${eve.id}"/>
					<c:param name="name" value = "${eve.name}"/>
					<c:param name="discription" value = "${eve.discription}"/>
					<c:param name="venue" value = "${eve.venue}"/>
					<c:param name="price" value = "${eve.price}"/>
				</c:url>
				<a href="${delEvent}">
					<input type="button" name="update" value="Delete Event">
				</a>
				</form>
			</div>
		</div>
	</c:forEach>
</body>
</html>