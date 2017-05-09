<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabla</title>
</head>
<body>
	<table cols= 5 border=1>
		<tr>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Edad</td>
		<td>Dni</td>
		<td>Género</td>
		</tr>
		
		<c:forEach begin="0" step= "1" items="${tablaAMostrar.rows}">
		<tr>
		<td><c:out value= "${tablaAMostrar.nombre}"></c:out></td>
		<td>${tablaAMostrar.apellido}</td>
		<td>${tablaAMostrar.edad}</td>
		<td>${tablaAMostrar.dni}</td>
		<td>${tablaAMostrar.genero}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>