<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Form</title>
</head>
<body>
<h2>Travel Booking</h2>
<from action = "Bookingservlet" method = "post">
Name:
<input type = "text"
name="name">
<br><br>
Package: <input type ="text" name="package">
<br><br>
Booking Date: <input type = "date" name = "date">
<br><br>
<input type = "submit" value = "Book">
</from>
</body>
</html>