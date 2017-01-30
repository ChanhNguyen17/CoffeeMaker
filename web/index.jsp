<%-- 
    Document   : index
    Created on : Jan 26, 2017, 9:54:19 AM
    Author     : chanhnguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
    </head>
    <body>
        <div class="container">
            <h1>Coffee Maker</h1>
            <div class="row">
                <div class="col-xs-4">
                    <ul class="list-group">
                        <li class="list-group-item" id="add-water"><button>Add Water</button></li>
                        <li class="list-group-item" id="add-bean"><button>Add Bean</button></li>
                        <li class="list-group-item" id="on-off-button"><button>On/Off</button></li>
                        <li class="list-group-item" id="brew"><button>Brew</button></li>
                    </ul>
                </div>
                <div class="col-xs-8">
                    <ul class="list-group">
                        <div id="on-off-display" class="list-group-item">IsOn: false</div>
                        <div id="water" class="list-group-item">Water: 0</div>
                        <div id="bean" class="list-group-item">Bean: 0</div>
                    </ul>
                    <div id="cannotMake" hidden class="alert alert-danger">Sorry, we cannot make coffee</div>
                </div>
            </div>
        </div>
        <script src="js/jquery-3.1.1.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/myjavascript.js"></script>
    </body>
</html>
