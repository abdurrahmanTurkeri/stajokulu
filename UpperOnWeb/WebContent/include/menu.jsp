<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>



<div class="header" >
    <div class="bottom">
        <div class="containerNav">
            <div class="row" style="float: left;width: 100%;">
                <div class="span8">
                    <div class="logo">
                        <a href="home.jsp" >
                            <img style="width: 200px;"  src="resources/images/stajokulu.png" alt="Zaga Home" />
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
                        <a href="index.jsp" >Ana Sayfa</a>
                    </li>


                    <li>
                        <a href="insert.jsp" >Ekle</a>
                    </li>

                    <li >
                        <a href="update.jsp" >Guncelle</a>
                    </li>

                   
                </ul>

            </div>
        </div>
        <div class="span3" style="width: 30%;" id="userContainer">

        </div>             
      
    </div>
</nav>