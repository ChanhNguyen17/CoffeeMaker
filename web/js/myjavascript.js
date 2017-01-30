/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function Ajax(info) {
    $.ajax({
        type: 'GET',
        url: 'CoffeeMakerServlet',
        data: {"button": info},
        success: function (result) {
            console.log(result);
            if (info === "clickedOnOff") {
                $('#on-off-display').html("IsOn: "+result);
            } else if (info.includes("Water")) {
                $('#water').html("Water: " + result);
            } else if (info.includes("Bean")) {
                $('#bean').html("Bean: " + result);
            } else if (info === "brew") {
                if (result === "noCoffee") {
                    $('#cannotMake').show("slow", function(){
                        $(this).hide("slow"); 
                    });
                } else {
                    var res = result.split("-");
                    $('#water').html("Water: " + res[0]);
                    $('#bean').html("Bean: " + res[1]);
                }
            }
        }
    });

}

$(document).ready(function(){
    buttonHandler();
});

function buttonHandler(){
    $('#on-off-button').click(function(){
        Ajax("clickedOnOff");
    });
    
    $('#add-water').click(function(){
        Ajax($('#water').text());
    });
    
    $('#add-bean').click(function(){
        Ajax($('#bean').text());
    });
    
    $('#brew').click(function(){
        Ajax("brew");
    });
}



