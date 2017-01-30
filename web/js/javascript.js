/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var req;
var isIE;

var infoList;
var addButton;
var makeCoffee;

function Ajax() {
    $.ajax({
        method: "POST",
        url: "some.php",
        data: {name: "John", location: "Boston"}
    })
        .done(function (msg) {
            alert("Data Saved: " + msg);
        });
}

function init() {
    infoList = document.getElementById("info-list");
    addButton = document.getElementById("add-button");
    makeCoffee = document.getElementById("make-coffee");

    addWater = document.getElementById("add-water");
    addBean = document.getElementById("add-bean");
    onOff = document.getElementById("onOff");
    brew = document.getElementById("brew");

    

    //completeTable.style.top = getElementY(autoRow) + "px";
}

function doCompletion() {
    var url = "autocomplete?action=complete&id=" + escape(infoList.value);
    req = initRequest();
    req.open("GET", url, true);
    req.onreadystatechange = callback;
    req.send(null);
}

function initRequest() {
    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') !== -1) {
            isIE = true;
        }
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        isIE = true;
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

function clearTable() {
    if (infoList.getElementsByTagName("tr").length > 0) {
        infoList.style.display = 'none';
        for (loop = infoList.childNodes.length - 1; loop >= 0; loop--) {
            infoList.removeChild(infoList.childNodes[loop]);
        }
    }
}

function callback() {

    clearTable();

    if (req.readyState === 4) {
        if (req.status === 200) {
            parseMessages(req.responseXML);
        }
    }
}