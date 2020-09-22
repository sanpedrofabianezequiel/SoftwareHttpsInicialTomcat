<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Login" method="post">

<div>
	<label for="usuario" >Usuario</label>
		<input   type="text" name="usuario" id="" placeholder="user" required>
</div>


<div>
	<label for="clave" >Clave</label>
		<input   type="password" name="clave" id="" placeholder="user" required>
</div>
<div>
	<button type="submit">Enviar</button>
</div>

<div>
	<button type="reset">Limpiar Campos</button>
</div>
</form>


</body>
</html>