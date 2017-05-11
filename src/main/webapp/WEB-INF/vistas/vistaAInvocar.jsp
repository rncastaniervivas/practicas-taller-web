<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mi primera vista</title>
</head>
<body>
	<br>
	${mensajeAMostrar}
	<br>
<table border="3">
		<tr>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>Edad</th>
		<th>Dni</th>
		<th>Género</th>
		</tr>
	<tbody>
		<c:forEach begin="1" end="${numero}" step= "1" varStatus="loopCounter">
		<tr>
		<td><c:out value= "${miPersona.nombre}"></c:out></td>
		<td><c:out value= "${miPersona.apellido}"></c:out></td>
		<td><c:out value= "${miPersona.edad}"></c:out></td>
		<td><c:out value= "${miPersona.dni}"></c:out></td>
		<td><c:out value= "${miPersona.genero}"></c:out></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>