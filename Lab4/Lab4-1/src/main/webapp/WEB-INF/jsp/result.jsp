<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Calculator Results</h4>
	<form action="calculator"  method="get">
		<input name="add1" type="text" class="textBox" readonly  value="${calculator.num1}" />+
		<input name="add2" type="text" class="textBox" readonly value="${calculator.num2}"/>=
	
 			<input name="sum" type="text" class="textBoxBlue" readonly value="${calculator.result1}"/>
 
		<br> 	
 
		<input name="mult1" type="text" class="textBox" readonly value="${calculator.num3}"/>*
		<input name="mult2" type="text" class="textBox" readonly value="${calculator.num4}"/>=
		<input name=product" type="text" class="textBox" readonly value="${calculator.result2}"/>
		<br>

		<br>
			<input type="submit" value="Try Again" />
		</form>
	
</body>
</html>