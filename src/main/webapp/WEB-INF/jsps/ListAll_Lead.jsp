<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu_Lead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<a href="viewleadpage">Create New Lead</a>
	<h3>List of Leads</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${leads }" var="lead">
			<tr>
				<th>${lead.id }</th>
				<th><a href="getById?id=${lead.id }">${lead.firstName }</a></th>
				<th>${lead.lastName }</th>
				<th>${lead.email }</th>
				<th>${lead.leadSource }</th>
				<th>${lead.mobile }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>