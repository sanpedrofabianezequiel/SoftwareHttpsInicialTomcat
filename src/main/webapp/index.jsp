<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h2>
	Titulo de Articulo
	</h2>

	<%
		for(int i=0;i < 4 ; i++){
			out.print("<h3> " + (i+1) +"</h3>");
		}
	
	%>





</body>
</html>