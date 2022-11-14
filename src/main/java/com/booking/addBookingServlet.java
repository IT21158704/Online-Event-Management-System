package com.booking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.event.event;
import com.event.eventDBUtil;


public class addBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cid = request.getParameter("cid");
		String eid = request.getParameter("eid");
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String discription = request.getParameter("discription");
		String venue = request.getParameter("venue");
		
		boolean isTrue;
		
		isTrue = bookingDBUtil.addBooking(eid, cid, type, date, discription, venue);
		
		if(isTrue == true){
			
			List<booking> bknDetails = bookingDBUtil.Validate(eid);
			request.setAttribute("bknDetails", bknDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myBooking.jsp");
			dis.forward(request, response);
			
		}else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Error');");
			out.println("location='addBooking.jsp'");
			out.println("</script>");
		}
		
	}

}
