package com.booking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.event.eventDBUtil;


public class deleteBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =  request.getParameter("eid");
		
		boolean isTrue = bookingDBUtil.deleteBooking(id);
				
		if(isTrue == true){

			RequestDispatcher dis = request.getRequestDispatcher("myBooking.jsp");
			dis.forward(request, response);
			
		}else {
		}
		
		
	}

}
