<%-- 
    Document   : Practica4Respon
    Created on : 19-sep-2018, 12:00:45
    Author     : LSTI204_A6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4: Respuesta</title>
        <%      String name = request.getParameter("name");
                String ap1 = request.getParameter("lastname1");
                String ap2 = request.getParameter("lastname2");
                String cumple = request.getParameter("brtdy");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");      %>
    </head>
    <body>
      <fieldset>
       <h1>Su nombre completo: <%= name %> <%= ap1 %> <%= ap2 %> </h1>
       <h1>Su fecha de nacimiento: <%= cumple %></h1>
       <h1>Su correo: <%= correo %></h1>
       <h1>Su contraseña: <%= pass %></h1>
      </fieldset>
    </body>
</html>
