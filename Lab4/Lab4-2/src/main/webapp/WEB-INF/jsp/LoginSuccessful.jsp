<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h2>Login Successful</h2>
<h3>${logedUser.name}</h3>

<form action="logout" method="get">
	<input type = "submit" value = "Logout"/>
</form>

<p />
<c:if test="${not empty logedUser}">
	<div>
		<form action="advice" method="get">
			
				<input type = "submit" value = "Get Advice"/>
			
		</form>
	</div>
</c:if>
</body>
</html>