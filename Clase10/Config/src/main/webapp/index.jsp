<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Configuración</title>
</head>
<body>
    


<!--Bloque de COMENTARIOS!-->
<!--Para ejecutar el GitBash sh mvnw spring-boot:run-->

<h1>Configuración de Sistema</h1>
<h2>Servidor de Nur o Nurvidor</h2>

<%
    //código Java
    out.println("<h4>Hola Mundo JSP!</h4>");

%>

<table>
    <tr>
        <td> Sistema Operativo: </td>
        <td><input type = "text" value="
            <% out.println(
            System.getProperty("os.name") +" "+ 
            System.getProperty("os.version") +" "+
            System.getProperty("os.arch")); %>" readonly size="60"/></td>
    </tr>
    <tr>
        <td>Versión de Java: </td>
        <td><input type="text" value="<% out.println(System.getProperty("java.version")); %>"readonly size="60"/></td>
    </tr>
    <tr>
        <td>Nombre de Usuario: </td>
        <td><input type="text" value="<% out.println(System.getProperty("user.name")); %>"readonly size="60"/></td>
    </tr>
    <tr>
        <td>Lenguaje de Usuario: </td>
        <td><input type="text" value="<% out.println(System.getProperty("user.language")); %>"readonly size="60"/></td>
    </tr>
    <tr>
        <td>Fecha: </td>
        <td><input type="text" value="<% out.println(LocalDate.now()); %>"readonly size="60"/></td>
    </tr>

</table>

</body>
</html>
