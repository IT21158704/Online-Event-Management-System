package com.event;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import feedback.feedback;
import feedback.feedbackDBUtil;


public class deleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id =  request.getParameter("id");
		
		boolean isTrue = eventDBUtil.deleteEvent(id);
				
		if(isTrue == true){

			RequestDispatcher dis = request.getRequestDispatcher("event.jsp");
			dis.forward(request, response);
			
		}else {
		}
		
	}

}