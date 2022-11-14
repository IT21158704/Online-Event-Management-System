package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =  request.getParameter("cusID");
		
		boolean isTrue = customerDBUtil.deleteCustomer(id);
		
		if(isTrue == true){

			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}else {
			
			List<Customer> cusDetails = customerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);

			RequestDispatcher dis2 = request.getRequestDispatcher("UserAccount.jsp");
			dis2.forward(request, response);
		}
		
	}

}
