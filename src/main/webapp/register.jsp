<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="assests/css/adminlogin.css">
    <link rel="stylesheet" href="assests/css/Header.css">
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<!--=======================Header Start=======================-->
        <header>
            <div class="nav-bar">
                <div class="logo"><h3>Eventive</h3></div>
                <div class="navigation">
                    <div class="nav-items">
                    	<a href="index.jsp">Home</a>
                        <a href="#">Reviews</a>
                        <a href="#">Contact Us</a>
                    </div>
                </div>
            </div>
        </header>
	<!--=======================Header End=======================-->
	<div class="container">
	<h1>Sign Up</h1>
		<div class="form flex-center">
			<form action="CustomerInsert" method = "post">
				Name : <input type="text" placeholder="Enter Your Name"  name="name">
				Email : <input type="text" placeholder="Enter Email"  name="email">
				Phone No : <input type="text" placeholder="07********"  name="phone">
				Username : <input type="text" placeholder="Enter Username"  name="uid">
				Password : <input type="password" placeholder="******"  name="pwd">
				<input type="submit" name="submit" value="Register"><input type="reset" value="Reset">
			</form>
		</div>
		<p>Already have an account? <b><a href="login.jsp">Sign in</a></b>
	</div>
</body>
</html>