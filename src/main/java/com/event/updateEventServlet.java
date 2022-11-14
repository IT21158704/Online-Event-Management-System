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


public class updateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id =  request.getParameter("id");
		String name =  request.getParameter("name");
		String discription =  request.getParameter("discription");
		String venue =  request.getParameter("venue");
		String price =  request.getParameter("price");
		
		boolean isTrue = eventDBUtil.updateEvent(id, discription, venue, price);
		
		if(isTrue == true){
			
			List<event> eveDetails = eventDBUtil.Validate(id);
			request.setAttribute("eveDetails", eveDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request, response);
			
		}else {

			List<event> eveDetails = eventDBUtil.Validate(id);
			request.setAttribute("eveDetails", eveDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request, response);
						
		}
		
	}

}
