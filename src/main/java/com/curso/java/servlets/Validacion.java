package com.curso.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validacion
 */
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String usuario;
		String clave;
		usuario=request.getParameter("usuario");
		clave=request.getParameter("clave");
		
		
		
		if(usuario.equalsIgnoreCase("user1") && clave.equalsIgnoreCase("1234")) {
			response.sendRedirect("Home.html");
		}else {
			response.sendRedirect("error.html");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario;
		String clave;
		usuario=request.getParameter("usuario");
		clave=request.getParameter("clave");
		
		
		
		
		PrintWriter out= response.getWriter();
		
		out.print("<html>");                                     
		out.print("<body>");
		
		
		if (usuario.equalsIgnoreCase("user1") && clave.equals("1234")) {
			
			out.print("<h1>  Bienvenido</h1>");
			
		}else {
			out.print("<h1>  Credenciales incorrectas </h1>");
		}
		
		
		out.print("</body>");
		out.print("</hmtl>");
		out.close();
	}

}
