<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
Language : <a href="?language=en_US">English</a>|<a href="?language=zh_CN">Chinese</a>
	<div id="global">
		<form:form commandName="employee" action="employee_save" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id"><spring:message code="addEmployee.form.employeeId.label"/></label>
					<form:input path="id" id="id" />
					<div style="text-align: center;">
						<form:errors path="id" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="firstName"><spring:message code="addEmployee.form.employeeFirstname.label"/></label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName"><spring:message code="addEmployee.form.employeeLastname.label"/></label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="birthDate"><spring:message code="addEmployee.form.employeeBirthday.label"/></label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel"><spring:message code="addEmployee.form.employeeSalary.label"/></label>
					<form:input path="salaryLevel" id="salaryLevel" />
					<div style="text-align: center;">
						<form:errors path="salaryLevel" cssStyle="color : red;" />
					</div>
				</p>
				<h4>Address:</h4>
				<p>
					<label for="street"><spring:message code="addEmployee.form.employeeStreet.label"/></label>
					<form:input path="address.street" id="street" />
					<div style="text-align: center;">
						<form:errors path="address.street" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="state"><spring:message code="addEmployee.form.employeeState.label"/></label>
					<form:input path="address.state" id="state" />
					<div style="text-align: center;">
						<form:errors path="address.state" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="zipCode"><spring:message code="addEmployee.form.employeeZipcode.label"/></label>
					<form:input path="address.zipCode" id="zipCode" />
					<div style="text-align: center;">
						<form:errors path="address.zipCode" cssStyle="color : red; " />
					</div>
				</p>
				<h4>Photo:</h4>
				<p>
					<label for="employeePhoto"><spring:message code="addEmployee.form.employeePhoto.label"/></label>
					<form:input type="file" path="employeePhoto" id="employeePhoto" />
					
				</p>
				
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> 
					<input id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
				
			</fieldset>
		</form:form>
	</div>
</body>
</html>
