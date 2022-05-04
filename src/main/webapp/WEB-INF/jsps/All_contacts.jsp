<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu_Lead.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>
	<h3>List of Contacts</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${contacts }" var="contact">
			<tr>
				<th>${contact.id }</th>
				<th><a href="getById?id=${contact.id }">${contact.firstName }</a></th>
				<th>${contact.lastName }</th>
				<th>${contact.email }</th>
				<th>${contact.leadSource }</th>
				<th>${contact.mobile }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>