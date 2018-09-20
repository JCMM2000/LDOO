<%-- 
    Document   : Practica4Form
    Created on : 19-sep-2018, 11:59:59
    Author     : LSTI204_A6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
        body {
        background-color: red;
        }
        
        form {
            left: 550px;
	    top: 25px;
            text-color: blue;
            position:relative;
            width:800px;
            height:540px;
            background-color: green;
            font-size: 30px;
            left: 400px;
            top: 80px;
            font-family: "Times New Roman";
            text-align: center;
        }
        </style>
        <title>Practica 4: Solicitud</title>
    </head>
    <body>
        <div id="form">
        <form action="Practica4Respon.jsp" id="form"> 
            <fieldset>
                <legend>Informacion Personal:</legend>
                Nombre:<br>
                <input size="50" type="text" name="name">
                <br>
                Primer Apellido:<br>
                <input size="50" type="text" name="lastname1">
                <br>
                Segundo Apellido:<br>
                <input size="50" type="text" name="lastname2">
                <br>
                Fecha de Nacimiento:<br>
                <input size="50" type="date" name="brtdy">
                <br>
                Correo:<br>
                <input size="50" type="email" name="mail">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="pass">
                <br>
                <br>
                <input type="submit" value="Registrar" > 
            </fieldset>
        </form>
      </div>
    </body>
</html>
