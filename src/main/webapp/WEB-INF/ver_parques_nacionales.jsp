<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Set" %>
<%@ page import="cr.ac.ucr.paraiso.lenguajes.domain.ParqueNacional" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Parques Nacionales</title>
</head>
<body>
    <h1>Parques Nacionales</h1>
    <% Set<ParqueNacional> parques = 
        (Set<ParqueNacional>) request.getAttribute("parquesNacionales"); %>
    
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
        </tr>
    <% for (ParqueNacional p : parques) { %>
        <tr>
            <td><%= p.getIdParqueNacional() %></td>
            <td><%= p.getNombre() %></td>
        </tr>
    <% } %>
    </table>
    
    <br>
    <a href="./index.html">Volver al inicio</a>
</body>
</html>