package feedback;

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

import com.customer.Customer;
import com.customer.customerDBUtil;

public class insertFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");
		
		boolean isTrue;
		
		isTrue = feedbackDBUtil.insertfeedback(id, name, feedback);
		
		if(isTrue == true){
			
			List<Customer> cusDetails = customerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserAccount.jsp");
			dis.forward(request, response);
			
			
		}else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Error');");
			out.println("location='feedback.jsp'");
			out.println("</script>");
		}
		
	}

}

