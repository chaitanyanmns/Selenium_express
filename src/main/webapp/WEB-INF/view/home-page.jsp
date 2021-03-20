
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOMEPAGE</title>
<style type="text/css">
	.error{
			color:red;
			position: fixed;
			margin-left: 20px;
			text-align: left;
		  }

</style>

<script type="text/javascript">

	function validateUserName(){
		var userName = document.getElementById("yn").value;
		if(userName.length < 2){
			//alert("client side validation is not success")
			return false
		}
		return true;
	}

</script>

</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<hr/>
	
	<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for='yn'>Your Name :</label>
				<form:input id='yn'	path='userName' />
				<form:errors path='userName' cssClass="error"/>
			</p>
			<p>
				<label for='cn'>Crush Name :</label> 
				<form:input id='cn'	path='crushName' />
				<form:errors path='crushName' cssClass="error"/>
			</p>
			<p>
			<form:checkbox path="termAndCondition"/>
			<label>I am agreeing that this is for fun</label>
			<form:errors path="termAndCondition" cssClass="error" />
			</p>
			<input type='submit' value='calculate' />
		</div>
	</form:form>

</body>
</html>