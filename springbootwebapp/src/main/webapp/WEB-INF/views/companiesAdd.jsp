<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Company</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Add Company</h1>
	<form:form action = "${pageContext.request.contextPath}/saveCompany" modelAttribute="company">
	<div class="col-xs-3">
		<label class="control-label" for="ex2">Company Name:</label>
		<form:input class="form-control" path="name" id="ex2"/>

		<label class="control-label" for="ex2">Opening Date:</label>
		<form:input class="form-control" path="companyOpeningDate" id="ex2"/>

		<label class="control-label" for="ex2">Department:</label>
		<form:input class="form-control" path="department" id="ex2"/>

		<form:hidden path = "id"/>
		<button type = "submit" class="btn btn-default">Save</button>
	</div>
	</form:form>
</body>
</html>