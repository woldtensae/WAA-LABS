<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Valued Employees</h1>
				<p>Add a new one<p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newEmployee" class="form-horizontal"  action="employee" method="post">
			<fieldset>
				<legend>Find Employee by employee number</legend>

				
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="employeeNumber"> Employee Number</label>
					<div class="col-lg-10">
						<form:input id="employeeNumber" path="employeeNumber" type="text" class="form:input-large"/>
						<form:errors path="employeeNumber" cssClass="text-danger"/>
					</div>
				</div>

				
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Find"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
