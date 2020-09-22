<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Usuario:<%=request.getParameter("usuario") %> </h1>
	<br>
	<h1>Clave: <%=request.getParameter("clave") %></h1>

	<a href="formulario.jsp">Volver</a>
</body>
</html>