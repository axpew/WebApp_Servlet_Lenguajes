<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Set" %>
<%@ page import="cr.ac.ucr.paraiso.lenguajes.domain.Provincia" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insertar Parque Nacional</title>
</head>
<body>
    <h1>Insertar Parque Nacional</h1>
    <% Set<Provincia> provincias = 
        (Set<Provincia>) request.getAttribute("provincias"); %>
    
    <form action="./guardarParque" method="post">
        <label for="idParque">ID Parque Nacional:</label>
        <input type="text" id="idParque" name="idParque" required>
        <br><br>
        
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <br><br>
        
        <label for="provincia">Provincia:</label>
        <select id="provincia" name="provincia" required>
        <% for (Provincia prov : provincias) { %>
            <option value="<%= prov.getId() %>"><%= prov.getNombre() %></option>
        <% } %>
        </select>
        <br><br>
        
        <button type="submit">Guardar</button>
    </form>
    
    <br>
    <a href="./verParquesNacionales">Volver a la lista</a>
</body>
</html>