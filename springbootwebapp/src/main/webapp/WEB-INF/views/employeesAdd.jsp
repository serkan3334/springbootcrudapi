<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Employee</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Add Employee</h1>
	<form:form action="${pageContext.request.contextPath}/saveEmployee" modelAttribute="employee">

		<div class="col-xs-3">
			<label class="control-label" for="ex2">TCKN:</label>
			<form:input class="form-control" path="cid" id="ex2"/>

			<label class="control-label" for="ex2">Name/Surname:</label>
			<form:input class="form-control" path="name" id="ex2"/>

			<label class="control-label" for="ex2">Phone Numer:</label>
			<form:input class="form-control" path="phoneNumber" id="ex2"/>

			<label class="control-label" for="ex2">Select Gender:</label><br/>
				<form:radiobutton class="form-check-input" path="gender" value ="Male"/>Male
				<form:radiobutton class="form-check-input" path="gender" value ="Female"/>Female<br/>

			<label class="control-label" for="ex2">Company:</label>
			<form:input class="form-control" path="companyInfo" id="ex2"/>

			<label class="control-label" for="ex2">Departement:</label>
				<form:select class="form-control" path="department">
					<form:option value="Support">Support</form:option>
					<form:option value="Testing">Testing</form:option>
					<form:option value="Development">Development</form:option>
					<form:option value="Business Analyst">Business Analyst</form:option>
				</form:select><br/>

			<label class="control-label" for="ex2">E-Mail:</label>
			<form:input class="form-control" type="mail" path="email" id="ex2"/><br/>

			<form:hidden path="id"/>
			<button type = "submit" class="btn btn-default">Save</button>
		</div>
	</form:form>
</body>
</html>