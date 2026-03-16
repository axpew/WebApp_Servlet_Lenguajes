<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="cr.ac.ucr.paraiso.lenguajes.domain.ParqueNacional" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle del Parque</title>
</head>
<body>
    <h1>Detalle del Parque Nacional</h1>
    <% ParqueNacional parque = (ParqueNacional) request.getAttribute("parque"); %>
    
    <p><strong>ID:</strong> <%= parque.getIdParqueNacional() %></p>
    <p><strong>Nombre:</strong> <%= parque.getNombre() %></p>
    
    <br>
    <a href="./verParquesNacionales">Volver a la lista</a>
</body>
</html>