package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UpdateCustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =  request.getParameter("cusID");
		String name =  request.getParameter("cusName");
		String email =  request.getParameter("cusEmail");
		String phone =  request.getParameter("cusPhone");
		String username =  request.getParameter("cusUsn");
		String password =  request.getParameter("cusPwd");
		
		boolean isTrue = customerDBUtil.updatecustomer( id, name, email, phone, username, password);
		
		if(isTrue == true){
			
			List<Customer> cusDetails = customerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserAccount.jsp");
			dis.forward(request, response);
			
		}else {

			List<Customer> cusDetails = customerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("UserAccount.jsp");
			dis2.forward(request, response);
						
		}
		
	}

}
