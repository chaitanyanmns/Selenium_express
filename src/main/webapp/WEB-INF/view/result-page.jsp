<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ResultPage</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr /><br/>
	
	<h1>The Love Calculator Predicts :</h1><br/>
	
	${userInfo.userName} and ${userInfo.crushName} are<br/>
	friends<br/>
	<a href="/spring-love-calculator/sendEmail/${userInfo.userName}">send result to email</a>
	
	
	
	
</body>
</html>