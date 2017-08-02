<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="header" >
    <div class="bottom">
        <div class="containerNav">
            <div class="row" style="float: left;width: 100%;">
                <div class="span8">
                    <div class="logo">
                        <a href="home.jsp" >
                            <img  src="resources/images/zaga_home.png" alt="Zaga Home" />
                        </a>
                    </div>
                </div>
                <div class="span4">
                    <div class="search">
                        <input type="text" name="arama"
                               placeholder="Arama Yap"
                               onkeydown="alert('Keydown eventi tetiklendi')" 
                               onkeypress="alert('KeyPress eventi tetiklendi')"
                               onkeyup="alert('Key eventi tetiklendi')"
                               />
                    </div>
                    <div class="span2">
                        <div class="mini-cart">
                            <a href="cart.html" title="Sepetim &rarr;">
                                <span>3</span>
                            </a>									
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<nav class="navigation" >
    <div class="containerNav">
        <div class="span9">
            <div class="megamenu_container">
                <ul class="main_menu">
                    <li>
                        <a href="home.jsp" >Ana Sayfa</a>
                    </li>


                    <li>
                        <a href="#" >Markalar</a>
                    </li>

                    <li >
                        <a href="#" >Blog</a>
                    </li>

                    <li>
                        <a href="#" >Mağazalar</a>
                    </li>

                    <li  class="has_sub_menu">
                        <a href="#" >Kategoriler</a>
                        <ul>
                            <li>
                                <a href="#">Bayan</a>
                            </li>
                            <li>
                                <a href="#">Erkek</a>
                            </li>
                            <li>
                                <a href="#">Çocuk</a>
                            </li>
                            <li>
                                <a href="#">Aksesuar</a>
                            </li>

                        </ul>
                    </li>

                    <li>
                        <a href="#" >İletişim</a>
                    </li>
                </ul>

            </div>
        </div>
        <div class="span3" style="width: 30%;" id="userContainer">

        </div>             
      
    </div>
</nav>