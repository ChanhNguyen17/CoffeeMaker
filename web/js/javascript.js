/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Not in use
var req;
var isIE;

var onOffDisplay;
var waterDisplay;
var beanDisplay;

function init(){
    onOffDisplay = document.getElementById("on-off-display");
    waterDisplay = document.getElementById("water");
    beanDisplay = document.getElementById("bean");
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