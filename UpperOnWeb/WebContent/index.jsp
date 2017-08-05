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
    <%@include file="include/menu.jsp" %>
	<div class="container">
	
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Age</th>
					<th>Action</th>
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
					<td><%=usertemp.getPassword()%></td>
					<td><%=usertemp.getAge()%></td>
					<td><a href="update.jsp?guncellenecekEleman=<%=usertemp.getIdUser() %>" class="btn btn-primary" role="button">Güncelle</a>
					<a href="delete.jsp?silinecekEleman=<%=usertemp.getIdUser() %>" class="btn btn-danger" role="button">Sil</a>
					</td>
				</tr>
				<%
					}
				%>

			</tbody>
		</table>
	</div></html>