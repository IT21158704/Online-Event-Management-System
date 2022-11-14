package com.event;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class viewEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("ename");
		
		eventDBUtil.ValidatebyName(name);
		
		try {
		List<event> eveDetails = eventDBUtil.ValidatebyName(name);
		request.setAttribute("eveDetails", eveDetails);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
		dis.forward(request, response);
	}

}

