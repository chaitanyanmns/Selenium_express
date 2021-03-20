<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegPage</title>

<style type="text/css">
	.error{
			color:red;
			position: fixed;
			margin-left: 20px;
			text-align: left;
		  }
</style>
</head>
<body>

	<h1 align="center">Registration page</h1>
	<br />
	<form:form action="registration-success" method="GET"
		modelAttribute="userReg">

		<div align="center">
			<label>User :</label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"/>
			<br> <label>UserName :</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="error"/>
			<br> <label>Password :</label>
			<form:input path="password" />
			<br> <label>countryName :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Usa" label="United States"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>
				<form:option value="Sl" label="SriLanka"></form:option>
			</form:select>
			<br> <label>Hobbies :</label> Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Reading :
			<form:checkbox path="hobbies" value="reading" />
			Travel :
			<form:checkbox path="hobbies" value="travel" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />
			<br> <label>Gender :</label> 
			Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />
			<br>
			<label>Age:</label>
			<form:input path="age"/>
			<form:errors path="age" cssClass="error"  />

		</div>
		<br>

		<div align="center">
			<h3>Communication</h3>
			<label>Email :</label>
			<form:input path="communicationDTO.email" />
			<form:errors path="communicationDTO.email" cssClass="error"/>
			<br/>
			<label>Phone number :</label>
			<form:input path="communicationDTO.phone" />
		</div>
		<br>
		
		<div align="center">
			<input type="submit" value="register">
		</div>


	</form:form>

</body>
</html>