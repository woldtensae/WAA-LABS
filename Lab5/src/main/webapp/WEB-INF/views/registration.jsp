<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<div style="width:50%; margin-left:auto;">
<h1>Registration Form</h1><br />
	<form:form modelAttribute="student" action="registration" method="post">
		<label for="firstname">First name</label>
		<form:input path="firstName" id="firstname" />
		<div style="text-align: center;">
			<form:errors path="firstName" cssStyle="color : red;" />
		</div><br /><br />
		
		<label for="lastname">Last name</label>
		<form:input path="lastName" id="lastname" />
		<div style="text-align: center;">
			<form:errors path="lastName" cssStyle="color : red;" />
		</div><br /><br />
		
		<label for="email">Email</label>
		<form:input path="email" id="email" />
		<div style="text-align: center;">
			<form:errors path="email" cssStyle="color : red;" />
		</div><br /><br />
		
		<label for="birthday">BirthDay</label>
		<form:input path="birthday" id="birthday" />
		<div style="text-align: center;">
			<form:errors path="birthday" cssStyle="color : red;" />
		</div><br /><br />
		
		<label for="gender">Gender</label>
		<form:select path="gender" id="gender">
			<form:option label="M" value="M" />
			<form:option label="F" value="F"/>
		</form:select><br /><br />
		
		<label for="areaCode">Area Code</label>
		<form:input path="phone.area" id="areaCode" />
		<div style="text-align: center;">
			<form:errors path="phone.area" cssStyle="color : red;" />
		</div><br /><br />
		
		<label for="prefix">Prefix</label>
		<form:input path="phone.prefix" id="prefix" />
		<div style="text-align: center;">
			<form:errors path="phone.prefix" cssStyle="color : red;" />
		</div><br /><br />
		
		
		<label for="number">Number</label>
		<form:input path="phone.number" id="number" />
		<div style="text-align: center;">
			<form:errors path="phone.number" cssStyle="color : red;" />
		</div><br /><br />
		
		
		 <input id="submit" type="submit" tabindex="5" 
                value="Register" />
        </form:form>
</div>         
</body>
</html>