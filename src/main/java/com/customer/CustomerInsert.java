package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		boolean isTrue;
		
		isTrue = customerDBUtil.insertcustomer(name, email, phone, username, password);
		
		if(isTrue == true){
			RequestDispatcher dis = request.getRequestDispatcher("RegisterSuccessful.jsp");
			dis.forward(request, response);
		}else {
			/*RequestDispatcher dis2 = request.getRequestDispatcher("RegisterUnsuccessful.jsp");
			dis2.forward(request, response);*/
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Your username is already exists');");
			out.println("location='register.jsp'");
			out.println("</script>");
		}
		
	}

}
