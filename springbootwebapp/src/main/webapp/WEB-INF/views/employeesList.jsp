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
	<h1 class="text-center">List of Employees</h1>
	<table border = "3" class="table">
		<tr class="active">
			<th>ID</th>
			<th>Name</th>
			<th>Phone Number</th>
			<th>Gender</th>
			<th>Company Info</th>
			<th>Department</th>
			<th>E-Mail</th>
			<th></th>
		</tr>
		<c:forEach items="${list}" var="e">
			<tr>
				<td>${e.cid}</td>
				<td>${e.name}</td>
				<td>${e.phoneNumber}</td>
				<td>${e.gender}</td>
				<td>${e.companyInfo}</td>
				<td>${e.department}</td>
				<td>${e.email}</td>
				<td>
					<a href = "${pageContext.request.contextPath}/employee/${e.id}" class="btn btn-link">Edit</a>
					|
					<a href = "${pageContext.request.contextPath}/deleteEmployee/${e.id}" class="btn btn-link">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="window.location.href='${pageContext.request.contextPath}/openEmployeeView'" type='button 'class="btn btn-success">Add Employee</button>
</body>
</html>