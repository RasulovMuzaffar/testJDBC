<%-- 
    Document   : index
    Created on : 06.02.2017, 21:34:39
    Author     : Muzaffar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Pragma" content="no-cache">
        <meta http-equiv="Cache-Control" content="no-cache">
        <meta http-equiv="Expires">
        <title>JSP Page</title>

        <link href="static/css/bootstrap.min.css" rel="stylesheet">
        <link href="static/css/style.css" rel="stylesheet">
        
        


        <!--[if it IE9]>
        <script src="static/js/html5shiv.js"></script>
        <script src="static/js/respond.js"></script>
        <![endif]-->

    </head>
    <body>
        <div class="container">
            <h1>Hello World!</h1>
            <hr/>
            <form class="form-horizontal" method="post" action="Controller">
                <div class="form-group">
                    <!--<label class="col-md-1">ID</label>-->
                    <input type="hidden" name="flag" class="col-md-3" value="add"/>
                    <label class="col-md-1 text-right">TEXT</label>
                    <input type="text" name="text" class="col-md-3" required="required"/>
                    <label class="col-md-1 text-right">INT_</label>
                    <input type="text" name="int_" class="col-md-3" required="required"/>
                    <input type="submit" class="b btn btn-primary col-md-3" value="Add"/>
                </div>
                <div class="form-group">
                    <!--<input type="submit" class="b btn btn-primary col-md-12" value="Add"/>-->
                </div>
            </form>
            <div class="table-responsive">
                <table class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <td>TEXT</td>
                            <td>INT_</td>
                            <td>edit</td>
                            <td>delete</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.list}" var="l">
                            <tr>
                                <td>${l.text}</td>
                                <td>${l.int_}</td>
                                <td class="ssyl"><a href="Controller?id=${l.id}&flag=upd" class="glyphicon glyphicon-pencil"></a> </td>
                                <td class="ssyl"><a href="Controller" value="${l.id}" class="ahref"><span class="glyphicon glyphicon-trash"></span> </a> </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                
            </div>
        </div>

        

        <script src="static/js/jquery-3.1.1.min.js"></script>
        <script src="static/js/bootstrap.min.js"></script>

        <script src="static/js/delete.js"></script>
    </body>
</html>
