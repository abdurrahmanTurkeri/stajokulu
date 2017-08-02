<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.stajokulu.logicaldbconnection.service.UserService"%>
<%@page import="com.stajokulu.logicaldbconnection.model.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Simple Example</title>
<%@include file="head.jsp" %>
</head>
<body>


	<%
        UserService user = new UserService();
        List<User> userList = user.fetchAllUser();
    %>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (User usertemp : userList) {
				%>
				<tr>
					<th>&nbsp;</th>
					<th scope="row"><%=usertemp.getFirstName()%></th>
					<td><%=usertemp.getLastName()%></td>
					<td><%=usertemp.getEmailAddress()%></td>
				</tr>
				<%
					}
				%>

			</tbody>
		</table>
	</div></html>