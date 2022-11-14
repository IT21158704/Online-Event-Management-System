package com.event;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class insertEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String discription = request.getParameter("discription");
		String venue = request.getParameter("venue");
		String price = request.getParameter("price");
		
		boolean isTrue;
		
		isTrue = eventDBUtil.insertEvent(id, name, discription, venue, price);
		
		if(isTrue == true){
			
			List<event> eveDetails = eventDBUtil.Validate(id);
			request.setAttribute("eveDetails", eveDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("event.jsp");
			dis.forward(request, response);
			
		}else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Error');");
			out.println("location='enterEvent.jsp'");
			out.println("</script>");
		}
		
	}

}

