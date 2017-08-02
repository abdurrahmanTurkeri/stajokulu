<%-- 
    Document   : index
    Created on : May 31, 2014, 4:33:18 PM
    Author     : BAPC
--%>

<%@page import="com.stajokulu.pojo.User"%>
<%@page import="com.stajokulu.service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="resources/css/nivo-slider.css" />
        <link href="resources/css/style.css" rel="stylesheet"/>
        <link href="resources/themes/light/light.css" rel="stylesheet"/>
        <!--[if lt IE 11]>
           <link href="resources/css/styleIE.css"  rel="stylesheet"/>
       <![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



    </head>
    <body>
        <div class="wrapper" >

            <%@include  file="include/menu.jsp" %>  

            <div id="wrapper">

                <div class="slider-wrapper theme-default">
                    <div id="slider" class="nivoSlider">
                        <img src="resources/images/slides/img1.jpg" data-thumb="images/toystory.jpg" alt="" />
                        <a href="http://dev7studios.com"><img src="resources/images/slides/img2.jpg" data-thumb="images/up.jpg" alt="" title="This is an example of a caption" /></a>
                        <img src="resources/images/slides/img3.jpg" data-thumb="images/walle.jpg" alt="" data-transition="slideInLeft" />
                        <img src="resources/images/slides/img4.jpg" data-thumb="images/nemo.jpg" alt="" title="#htmlcaption" />
                    </div>
                    <div id="htmlcaption" class="nivo-html-caption">
                        <strong>This</strong> is an example of a <em>HTML</em> caption with <a href="#">a link</a>. 
                    </div>
                </div>

            </div>


            <%
                UserService us = new UserService();
                List<User> userList = us.getUserList();
            %>   



            <%            for (User user : userList) {

            %>
            <div class="user"><%= user.getUserName()%> - <%= user.getPassWord()%></div>
            <% }%>

            <c:out value="${sessionScope.UserList}"/>

            <c:forEach items="${sessionScope.UserList}" var="kullanici" varStatus="index">
                <div class="user">  ${kullanici.getUserName()} - ${kullanici.getPassWord()}</div>
            </c:forEach>




        </div>
    </body>
    <script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/js/bilgeadam.js"></script>
    <script type="text/javascript" src="resources/js/jquery.nivo.slider.js"></script>
    
    <script type="text/javascript">
        $(window).load(function() {
            $('#slider').nivoSlider();
        });
    </script>
</html>
