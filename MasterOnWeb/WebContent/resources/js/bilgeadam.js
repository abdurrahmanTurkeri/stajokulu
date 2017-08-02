// alert('Hazir Fonsiyon');

var degisken1 = 70;
var degisken2 = 30;
var sonuc = degisken1 + degisken2;
// alert(sonuc);


var currentPage = window.location.pathname;


var willAssignHtml = '<span style="margin-top:15px;display:block">'
        + '<img src ="resources/images/user_image.png"' +
        'style="width:30px;" /> Hoşgeldiniz AbdurrahmanT <span id="dateContainer"></span></span>';

document.getElementById('userContainer').innerHTML = willAssignHtml;


/**
if (currentPage.indexOf("index.jsp") > 0) {
    document.getElementById('userContainer').innerHTML = willAssignHtml;
} else if (currentPage.indexOf("home.jsp") > 0) {
    document.getElementById('userContainer1').innerHTML = willAssignHtml;
}else{
    document.getElementById('userContainer').innerHTML = willAssignHtml;
}
**/

getDateX();
var menuArray = getCategoryList();



function getDateX() {
    var todayVariable = new Date();
    var month = todayVariable.getMonth();
    month = month + 1;
    if (month < 10) {
        month = '0' + month;
    }
    var dayVar;
    if (todayVariable.getDate() < 10) {
        dayVar = '0' + todayVariable.getDate();
    } else {
        dayVar = todayVariable.getDate();
    }
    var dateText = dayVar + '/' + month + '/' + todayVariable.getFullYear();
    document.getElementById('dateContainer').innerHTML = dateText;
}

function getCategoryList() {
    var menuObject = new Object();
    menuObject.isim = 'Aksesuar';
    menuObject.link = '#';
    var menuObject2 = new Object();
    menuObject2.isim = 'İndirim';
    menuObject2.link = '#';
    menuObject2.image = 'resources/images/indirim.png';

    var menuArray = new Array();
    menuArray.push(menuObject);
    menuArray.push(menuObject2);
    return menuArray;
}



 