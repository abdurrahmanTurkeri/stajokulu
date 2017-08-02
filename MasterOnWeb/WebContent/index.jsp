<%-- 
    Document   : index
    Created on : May 31, 2014, 4:33:18 PM
    Author     : BAPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <link href="resources/css/style.css" rel="stylesheet"/>
        <!--[if lt IE 11]>
           <link href="resources/css/styleIE.css"  rel="stylesheet"/>
       <![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



    </head>
    <body>
        <div class="wrapper" >

            <%@include  file="include/menu.jsp" %>      


            <section class="main" id="productShowCase">
                <section class="category">
                    <div class="container">
                        <div class="row">
                            <div class="span3">
                                <aside class="sidebar">
                                    <div class="children">
                                        <div class="box border-top">
                                            <div class="hgroup title">
                                                <h3>
                                                    <a href="#"  title="Bayan Ürünleri">

                                                        Bayan</a>
                                                </h3>
                                                <ul class="category-list secondary">
                                                    <li>
                                                        <a href="#Ayakkabı" title="" >
                                                            <span class="count">12</span>
                                                            Ayakkabı
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#Çanta" title="" >
                                                            <span class="count">2</span>
                                                            Çanta
                                                        </a>

                                                    </li>
                                                    <li>
                                                        <a href="#Kemer" title="" >
                                                            <span class="count">6</span>
                                                            Kemer
                                                        </a>

                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </aside>
                            </div>  
                            <!--span3 Menu Bitti -->
                            <div class="span9">
                                <ul class="product-list isotope" >
                                    <li class="standart isotope-item " style="position: absolute; left: 0px; top: 0px; -webkit-transform: translate3d(0px, 0px, 0px);">
                                        <a href="#Urun" title="Ürüne Gitmek İçin Tıklayınız" >
                                            <div class="image">
                                                <img class="primary" src="resources/images/women2_2.jpg" alt="Elbise 1"/>
                                                <img class="secondary" src="resources/images/women2_1.jpg" alt="Elbise 1"/>
                                            </div>
                                            <div class="title">
                                                <div class="prices">
                                                    <span class="price">TL 58</span>
                                                </div>
                                                <h3>Kıyafet 1 </h3>
                                            </div>

                                        </a>                                       
                                    </li>
                                    <!-- 1 . ürün bitti  -->

                                    <li class="featured isotope-item" style="position: absolute; left: 0px; top: 0px; -webkit-transform: translate3d(300px, 0px, 0px);">
                                        <a href="#Urun" title="Ürüne Gitmek İçin Tıklayınız" >
                                            <div class="image">
                                                <img class="primary" src="resources/images/men1_1.jpg"  alt="Elbise2"/>
                                                <img class="secondary" src="resources/images/men1_2.jpg" alt="Elbise2"/>
                                            </div>
                                            <div class="title">
                                                <div class="prices">
                                                    <span class="price">TL 58</span>
                                                </div>
                                                <h3>Kıyafet 1 </h3>
                                            </div>

                                        </a>                                       
                                    </li>

                                    <li class="standart isotope-item" style="position: absolute; left: 0px; top: 0px; -webkit-transform: translate3d(0px, 425px, 0px);">
                                        <a href="#Urun" title="Ürüne Gitmek İçin Tıklayınız" >
                                            <div class="image">
                                                <img class="primary" src="resources/images/women1.jpg" alt="Elbise1"/>
                                                <img class="secondary" src="resources/images/women1_1.jpg" alt="Elbise1"/>
                                            </div>
                                            <div class="title">
                                                <div class="prices">
                                                    <span class="price">TL 58</span>
                                                </div>
                                                <h3>Kıyafet 1 </h3>
                                            </div>

                                        </a>                                       
                                    </li>
                                    <!-- 4. li eklendi -->
                                    <li class="standart isotope-item" style="position: absolute; left: 0px; top: 0px; -webkit-transform: translate3d(300px, 862px, 0px);">
                                        <a href="#Urun" title="Ürüne Gitmek İçin Tıklayınız" >
                                            <div class="image">
                                                <img class="primary" src="resources/images/ayakkabi1_1.jpg" alt="Elbise1"/>
                                                <img class="secondary" src="resources/images/ayakkabi1_2.jpg"  alt="Elbise1"/>
                                            </div>
                                            <div class="title">
                                                <div class="prices">
                                                    <span class="price">TL 98</span>
                                                </div>
                                                <h3>Ayakkabı 1 </h3>
                                            </div>

                                        </a>                                       
                                    </li>
                                    <!-- 5. li eklendi -->
                                    <li class="standart isotope-item" style="position: absolute; left: 0px; top: 0px; -webkit-transform: translate3d(600px, 862px, 0px);">
                                        <a href="#Urun" title="Ürüne Gitmek İçin Tıklayınız" >
                                            <div class="image">
                                                <img class="primary" src="resources/images/ayakkabi2_1.jpg"  alt="Elbise1"/>
                                                <img class="secondary" src="resources/images/ayakkabi2_2.jpg" alt="Elbise1"/>
                                            </div>
                                            <div class="title">
                                                <div class="prices">
                                                    <span class="price">TL 78</span>
                                                </div>
                                                <h3>Ayakkabı 2 </h3>
                                            </div>

                                        </a>                                       
                                    </li>
                                </ul>
                            </div>
                        </div> 
                    </div>
                </section>
            </section>
        </div>
    </body>
    <script type="text/javascript" src="resources/js/bilgeadam.js"></script>
    <script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
        //document.getElementById('productShowCase').style.display='none';
    </script>

</html>
