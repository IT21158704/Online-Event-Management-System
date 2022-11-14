<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="assests/css/Header.css">
		<link rel="stylesheet" href="assests/css/adminlogin.css">		
<meta charset="ISO-8859-1">
<title><c:forEach var="adm" items="${admDetails}">${adm.name}</c:forEach> | Home</title>
</head>

<body>
	
	     <!--=======================Header Start=======================-->
        <header>
            <div class="nav-bar">
                <div class="logo"><h3>Eventive</h3></div>
                <div class="navigation">
                    <div class="nav-items">
						<a><c:forEach var="adm" items="${admDetails}">${adm.name}</c:forEach></a>
                        <a href="enterEvent.jsp">Add Event</a>
                        <a href="event.jsp">View Event</a>
                        <a href="#">View Bookings</a>
                        <a href="#">Feedback</a>
                        <a href="index.jsp">Log Out</a>
                    </div>
                </div>
            </div>
        </header>

        <!--=======================Header End=======================-->
	
	<table align= "center" border = 1>
	<c:forEach var="adm" items="${admDetails}">
	
	<div class="container">
		<h1>${adm.name}'s Details</h1>
			<div class="form flex-center">
				<form action="" method="post">
					ID: ${adm.id}<br><br>
					Name: ${adm.name}<br><br>
					Email: ${adm.email}<br><br>
					Phone No: ${adm.phone}<br><br>
					Username: ${adm.username}<br><br><br><br>
			</form>
		</div>
	</div>		
	</c:forEach></table>
	
</body>
</html>