<%@page import="com.stajokulu.logicaldbconnection.model.User"%>
<%@page import="com.stajokulu.logicaldbconnection.service.UserService"%>
<%@page import="com.mysql.jdbc.StringUtils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>JSP Insert</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="head.jsp"%>
</head>
<body>

	<%
		String submit = request.getParameter("submit");
		if(submit!=null){
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String age = request.getParameter("age");
			String exampleInputEmail1 = request.getParameter("exampleInputEmail1");
			String exampleInputPassword1 = request.getParameter("exampleInputPassword1");
			User user=new User(firstName,lastName,age,exampleInputEmail1,exampleInputPassword1);
			
			boolean fistNameCheck=StringUtils.isEmptyOrWhitespaceOnly(firstName);
			boolean lastNameCheck=StringUtils.isEmptyOrWhitespaceOnly(lastName);
			boolean ageCheck=StringUtils.isEmptyOrWhitespaceOnly(age);
			boolean exampleInputEmail1Check=StringUtils.isEmptyOrWhitespaceOnly(exampleInputEmail1);
			boolean exampleInputPassword1Check=StringUtils.isEmptyOrWhitespaceOnly(exampleInputPassword1);
			
			if(!fistNameCheck && !lastNameCheck && !ageCheck && !exampleInputEmail1Check && !exampleInputPassword1Check){
				UserService userService=new UserService();
				boolean result=	userService.insertUser(user);
				if(result){
					  response.sendRedirect("index.jsp");
				}
			}else{
			%>
			<script type="text/javascript">
				alert("Eksik Bilgi girdiniz!!!");
			</script>
			<%
			}
		}
	%>

	<%@include file="include/menu.jsp"%>
	<form >
		<div style="width: 41%; margin: auto; margin-top: 100px;">
			<div class="form-group">
				<label for="firstName">Isim</label> <input type="text"
					class="form-control" id="firstName" name="firstName"
					aria-describedby="emailHelp" placeholder="Enter firstname">
			</div>
			<div class="form-group">
				<label for="lastName">Soyisim</label> <input type="text"
					class="form-control" id="lastName" name="lastName"
					aria-describedby="emailHelp" placeholder="Enter lastname">
			</div>
			<div class="form-group">
				<label for="age">Yasiniz</label> <input type="text"
					class="form-control" id="age" name="age"
					aria-describedby="emailHelp" placeholder="Enter age">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					name="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="Enter email"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="text" class="form-control" id="exampleInputPassword1"
					name="exampleInputPassword1" placeholder="Password">
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-info" value="Kayit Ol"
					name="submit">
			</div>
		</div>
	</form>

</body>
</html>